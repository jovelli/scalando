package test.scala.com.jovelli.flickr

import com.jovelli.flickr.client.HttpClient
import org.specs2.mutable._

class HttpClientSpec extends Specification { 
  
  "Http client" should {
    "reponse with a valid body" in {
      new HttpClient().get("https://httpbin.org/get") must beEqualTo("")
    }   
    
    "response with an error" in {
      new HttpClient().get("https://httpbin.org/get") must beEqualTo("")
    }
  }
}
