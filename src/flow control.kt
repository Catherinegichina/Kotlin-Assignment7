fun main(){
oddNumbers()
  digit()
}

fun oddNumbers( ){
  for (numbers in 1..100)
    if (numbers % 2 != 0) {
      println(numbers)
    }
//kama umepass parameters,unareturn,then print juu.
  //kama hujaeka iyo ya nje ya calibrace,unaeza print tu.
  //kama hujaeka any parameters,call functio normally.
}
fun words() {
  var letters = arrayOf("cryptocurrency", "blue", "peg", "bin")
  for (name in letters) {
    if (name.length > 5) {
      println(letters)
    }

  }
  fun robot(age:Int){
    if (age <= 6) {
      println("a glass of milk")
      }
      else if (age in 6..15) {
        println("drink fanta")
      } else {
        println("serve a bottle of cocacola for guests")
      }

      fun digit() {
        for (numbers in 1..100)
          if (numbers % 3 == 0 && numbers % 5 == 0) {
            println("fizzBuzz")
          } else if (numbers % 3 == 0) {
            println("fizz")
          } else if (numbers % 5 == 0) {
            println("buzz")
          } else {
            println("numbers")
          }
      }

