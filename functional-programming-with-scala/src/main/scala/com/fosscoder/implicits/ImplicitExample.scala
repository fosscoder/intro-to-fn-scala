package com.fosscoder.implicits

object ImplicitExample {
  case class Message(message: String)

  case class Sender(sourceName: String){
    def sendTextMessage(m: Message) = println(s"Message is coming from $sourceName and its content is ${m.message}")
  }

  def communicationFrom(m: Message)(implicit s: Sender) = s.sendTextMessage(m)

  def main(args: Array[String]) {

    implicit val defaultSource = Sender("Default source")

    communicationFrom(Message("Sample Sent 1!"))

    val newSender = Sender("The New Sender")

    communicationFrom(Message("Sample Sent 2!"))(newSender)

  }

}
