package com.jovelli.flickr.client

import com.jovelli.flickr.model.Foto
import javax.xml.ws.Response
import scala.xml.{ XML, Elem }
import com.typesafe.config.Config

sealed trait ResponseParser {
  def parse(xmlStr: String): Either[FlickrError, Seq[Foto]]
}

final class XMLFlickrResponseParser extends ResponseParser {
  import ResponseParser._
  
  override def parse(xmlStr: String): Either[FlickrError, Seq[Foto]] = {
    val xml = XML.loadString(xmlStr)
    
    (xml \\ "rsp" \ "@stat") text match {
      case `okStat` => Right(processSucess(xml))
      case `failStat` => Left(processFailure(xml))
      case _ => Left(FlickrUnknownError(unknownFlickrResponse))
    }
  }
  
  def processSucess(xml: Elem): Seq[Foto] =
    (xml \\ "photo") map { photo =>
      Foto(
        (photo \ "@id") text,
        (photo \ "@owner") text,
        (photo \ "@secret") text,
        (photo \ "@server") text,
        (photo \ "@farm").text.toInt,
        (photo \ "@title") text,
        stringToBoolean((photo \ "@ispublic") text),
        stringToBoolean((photo \ "@isfriend") text),
        stringToBoolean((photo \ "@isfamily") text)
      )
  }
  
  def processFailure(xml: Elem): FlickrError = {
    (xml \\ "err").map { error =>
      FlickrKnownError(
        (error \ "@code").text.toInt,
        (error \ "@msg") text
      )
    }
    .headOption.getOrElse(FlickrUnknownError(errorNotFound))
  }
}

private object ResponseParser {
  val okStat = "ok"
  val failStat = "fail"
  
  val unknownFlickrResponse = "Could not parse Flickr Unknown Response"
  val errorNotFound = "Could not parse Flickr Error Response"
  
  def stringToBoolean(value: String): Boolean = {
    value toInt match {
      case 1 => true
      case _ => false
    }
  }
}

sealed trait FlickrError  
final case class FlickrKnownError(code: Int, message: String) extends FlickrError
final case class FlickrUnknownError(message: String) extends FlickrError
