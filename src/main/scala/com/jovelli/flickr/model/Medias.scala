package com.jovelli.flickr.model

sealed trait Medias {
  def id: String
  def owner: String
  def secret: String
  def server: String
  def farm: Int
  def title: String
  def public: Boolean
  def friend: Boolean
  def family: Boolean
}

final case class Foto(id: String, owner: String, secret: String, server: String, farm: Int, title: String, public: Boolean, friend: Boolean, family: Boolean) extends Medias
final case class Video(id: String, owner: String, secret: String, server: String, farm: Int, title: String, public: Boolean, friend: Boolean, family: Boolean) extends Medias
