import java.lang.Integer.max
import java.lang.Integer.min
import java.util.Date

fun main(args: Array<String>) {
  val name = "Tom Schimmeck"
  for (zeichen in name) {
    val gross = zeichen.toUpperCase()
    print("$gross$zeichen-")
  }

//  bruteForce()

  optimiert(1_000_000)
}

private fun bruteForce() {
  println("Ganz einfach Methode")
  val start = Date()
  var zahl = 2
  while (zahl < 1_000_000) {
    if (isPrim(zahl)) {
      println("$zahl, ")
    }
    zahl++
  }
  val ende = Date()
  println("Dauer ${(ende.time - start.time) / 1000}")
}

private fun optimiert(obergrenze: Int) {
  println("Optimiert")
  val start = Date()
  var zahl = 2
  while (zahl < obergrenze) {
    if (isPrim2(zahl)) {
      println("$zahl, ")
    }
    zahl++
  }
  val ende = Date()
  println("Dauer ${(ende.time - start.time) / 1000}")
}

fun isPrim(zahl: Int): Boolean {
  var teiler = 2
  while (teiler < zahl) {
    val rest = zahl % teiler
    if (rest == 0) {
      return false
    }
    teiler++
  }

  return true
}

fun isPrim2(zahl: Int): Boolean {
  var teiler = 2
  val maxTeiler = min(zahl / 3 + 1, zahl)
  while (teiler < maxTeiler) {
    val rest = zahl % teiler
    if (rest == 0) {
      return false
    }
    teiler++
  }

  return true
}