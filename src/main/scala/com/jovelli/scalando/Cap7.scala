package com.jovelli.scalando

sealed class MediaCap7(val value: String) 

case class FotoCap7(id: Int, nome: String) extends MediaCap7("fotos")
case class VideoCap7(id: Int, nome: String) extends MediaCap7("videos")
