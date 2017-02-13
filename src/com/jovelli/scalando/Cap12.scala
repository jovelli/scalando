package com.jovelli.scalando

class Cap12 {
  implicit class PrintableFoto(foto: FotoCap7) {
    def print = println(s"Imprimindo a foto ${foto}")
  }
}
