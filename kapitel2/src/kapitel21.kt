import java.lang.Integer.max
import java.lang.Integer.min
import java.util.Date

fun main(args: Array<String>) {

  for (n in 0..10) {
    println("$n! = ${fakulaet(n)}")
  }

  println()

  for (n in 0..10) {
    println("Summe von $n = ${summe(n)}")
  }

}


fun fakulaet(n: Int): Int {
  var result = 1
  for (f in 1..n) {
    result *= f
  }
  return result
}

fun summe(n: Int): Int {
  var result = 0
  for (s in 0..n) {
    result += s
  }
  return result
}
