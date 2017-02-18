package com.jovelli.flickr.client

import org.specs2.mutable.Specification

class ResponserParserSpec extends Specification {
  "stringToBoolean" should {
    "retornar true quando passado valor 1" in {
      ResponseParser.stringToBoolean("1") must beEqualTo(true)
    }
    
    "retornar false quando passado valor 0" in {
      ResponseParser.stringToBoolean("0") must beEqualTo(false)
    }
    
    "retornar false quando passado valor diferente de 1 e 0" in {
      ResponseParser.stringToBoolean("4") must beEqualTo(false)
    }
  }
}
