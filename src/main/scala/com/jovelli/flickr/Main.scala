package com.jovelli.flickr

import com.typesafe.config.ConfigFactory
import com.jovelli.flickr.client.FlickrClient

object Main extends App {
  
    val config = ConfigFactory.load()
    val flickrClient = FlickrClient.fromConfig(config)
    
    flickrClient.buscarFotos(List("scala")) match {
      case Right(fotos) => fotos.foreach(println) 
      case Left(error) => println("Error processing")
    }
}
