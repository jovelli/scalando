package com.jovelli.flickr

import com.typesafe.config.ConfigFactory
import com.jovelli.flickr.client.FlickrClient

class Main extends App {
  val config = ConfigFactory.load()
  val flickrClient = FlickrClient.fromConfig(config)
  
  FlickrClient.buscaFotos(List("scala")) match {
    case Right(fotos) => fotos.foreach(println)
    case Left(error) => println("Error processing")
    // case Left(error) => println(s"Error processing ${error.msg}")
  }
}
