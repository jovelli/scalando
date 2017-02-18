package com.jovelli.flickr.client

import org.specs2.mutable.Specification
import com.jovelli.flickr.model.Foto
import scala.io.Source

class XMLFlickrResponseParserSpec extends Specification {
	
  "XMLFlickrResponseParser.parse" should {  
	  "falhar quando receber arquivo xml de formato desconhecido" in {
	    val parsed = parseFrom("src/test/scala/resources/unknown.xml")
	    parsed should beLeft(FlickrUnknownError(ResponseParser.unknownFlickrResponse))
	  }
	  
	  "falhar quando receber xml de erro conhecido" in {
	    val parsed = parseFrom("src/test/scala/resources/error.xml")
	    parsed should beLeft(FlickrKnownError(100, "Invalid API Key format"))
	  }
	  
	  "falhar quando receber xml de erro desconhecido" in {
	    val parsed = parseFrom("src/test/scala/resources/empty-error.xml")
	    parsed should beLeft(FlickrUnknownError(ResponseParser.errorNotFound))
	  }
	  
	  "retornar lista de Seq de Foto" in {
	    val parsed = parseFrom("src/test/scala/resources/fotos.xml")
	    parsed should beRight.like { 
	      case res => 
	        res should containTheSameElementsAs (List(
        	  Foto("32103715813", "37902992@N06", "af84c159c6", "2778", 3, "Mont Cenis, Le Court", true, false, false),
            Foto("32877907036", "37902992@N06", "2ccb8496d6", "3940", 4, "Mont Cenis, Le Court", true, false, false),
            Foto("32764929012", "37902992@N06", "1039a2e7df", "3669", 4, "Mont Cenis, Le Court", true, false, false),
            Foto("32075545564", "37902992@N06", "24ef4085fb", "602", 1, "Mont Cenis, Le Court", true, false, false),
            Foto("32877847226", "37902992@N06", "4aae95e037", "647", 1, "Mont Cenis, Le Court", true, false, false),
            Foto("32877826926", "37902992@N06", "7670274425", "681", 1, "Mont Cenis, Grand Croix", true, false, false),
            Foto("32103594823", "37902992@N06", "1c2f8ce749", "2203", 3, "Mont Cenis, Alpe Tour", true, false, false),
            Foto("32794723211", "35513418@N04", "f89ae19723", "744", 1, "The first snow (January 2017)", true, false, false),
            Foto("32073147014", "11293286@N08", "8628197f14", "3806", 4, "Blue Day", true, false, false),
            Foto("32532455460", "60399499@N06", "f0a177ef6f", "2095", 3, "blue shoes", true, false, false),
            Foto("32861835816", "28929465@N08", "327b2e3a0f", "2157", 3, "Anag022017_48", true, false, false),
            Foto("32859451946", "147049668@N03", "f8d53b1832", "2468", 3, "DSC_0060", true, false, false),
            Foto("32056205684", "126508109@N02", "9dba8ecc2d", "532", 1, "punto di fuga - vanishing point", true, false, false),
            Foto("32513515380", "25792071@N02", "7f80aae806", "596", 1, "la fantasia non ha padroni... nè servi... ( s.m. )", true, false, false),
            Foto("32820463716", "24271543@N03", "455838050f", "2806", 3, "Arjuzanx, Landes", true, false, false),
            Foto("32727897131", "38994684@N08", "bb4e71cd61", "2166", 3, ".064", true, false, false),
            Foto("32696668242", "38994684@N08", "bc5f2c42a0", "2651", 3, ".064", true, false, false),
            Foto("32000953524", "128691640@N04", "ce5d34a8e7", "3944", 4, "G272 XLW", true, false, false),
            Foto("32699297341", "49465710@N03", "44d1389f38", "714", 1, "la scala", true, false, false) 
	        ))
	    }
	  }
	}
  
  def parseFrom(file: String): Either[FlickrError, Seq[Foto]] = {
    val parser = new XMLFlickrResponseParser()
    val response = Source.fromFile(file).getLines().mkString("\n")
    
    parser.parse(response)
  }
}
