package com.fosscoder.functions

object Currying {
  case class Message(value : String)

  case class TelcoProvider(sourceName : String){
    def sendTextMessage(m: Message) = println(s"Text is coming from $sourceName and its value is ${m.value}")
  }

  // Scala Function
  def communicate(m: Message,t: TelcoProvider) = t.sendTextMessage(m)

  // Currying Function
  def communicateFrom(m: Message) = (s: TelcoProvider) => s.sendTextMessage(m)

  def communicateFromDifferentWay(m: Message)(s: TelcoProvider) = s.sendTextMessage(m)

  def messageWithSpecialChar(msg: String) = if (msg.trim.startsWith("$")) msg.trim.drop(1) else msg

  def messageWithSpecialCharPatternMatch(msg: String): String = {
      msg match {
      case x if x.trim.startsWith("$") => x.trim.drop(1)
      case _ => msg
      }
  }


  def main(args: Array[String]) {

    // Calling Scala Function
    communicate(Message("Hello!"), TelcoProvider("This is Vodafone!"))

    // Calling Scala Function
    TelcoProvider("Idea").sendTextMessage(Message("Hello!!"))

    // Calling Currying Function 1
    val communication = communicateFrom(Message("How you doing!"))
    communication(TelcoProvider("Airtel Bharati"))
    communication(TelcoProvider("Jio Telco"))
    // Calling Currying Function 2
    communicateFromDifferentWay(Message("??"))(TelcoProvider("Safari Com Africa"))



    // Transform normal Scala Function to Curried Function
    val curriedCommunication = (communicate _).curried

    val transformToNormal = Function.uncurried(curriedCommunication)

  }
}
