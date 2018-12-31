//implicit class ListMultiMap[A,B](val map: Map[A, List[B]]) extends AnyVal {
//  def addBinding(key: A, value: B): Map[A, List[B]] =
//    map + (key -> { value :: map.getOrElse(key, Nil) })
//}
//
//val result = Map(1 -> List("Chetan", "ChetanKhatri"))
//  .addBinding(2, "ABC")
//  .addBinding(2, "ZXS")
//
