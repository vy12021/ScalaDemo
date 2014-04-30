/**
 * Created by kites on 14-4-30.
 */
object HelloWorld {
  def main(args: Array[String]) {
    //println("HelloWorld!");
    //println(max1(3, 4))
    //println(max2(3, 4))
    //println(max3(3, 4))
    //val args2 = Array("zero")
    /*args2(0) = "Hello"
    args2(1) = ","
    args2(2) = "World"*/
    //while_loop(args);
    //for_loop(Array.apply("Hello", ",", "World", "OY"))
    //list_collect()
    tuple_collect()
  }

  var i = 0

  def max1(x: Int, y: Int): Int = {
    if(x > y) x else y
  }

  def max2(x: Int, y: Int) = {
    if(x > y) x else y
  }

  def max3(x: Int, y: Int) = if(x > y) x else y

  def while_loop(arg: Array[String]) {
    while (i < arg.length) {
      if(i != 0)
        print(" ")
      print(arg(i))
      i += 1
    }
    println()
  }

  def for_loop(arg: Array[String]) {
    for (i <- 0 to arg.length - 1) print(arg(i))
  }

  def list_collect() {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFour + " is a new List.")
  }

  def tuple_collect() {
    val pair = (99, "Luftballons")
    println(pair._1);
    println(pair._2)
  }

}
