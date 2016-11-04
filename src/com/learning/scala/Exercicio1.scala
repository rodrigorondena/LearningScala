package com.learning.scala

object Exercicio1 {
  // EXERCISE
  // Write some code that takes the value of pi, doubles it, and then prints it within a string with
  // three decimal places of precision to the right.
  // Just write your code below here; any time you save the file it will automatically display the results!

  def main(args: Array[String]) {
    val piSinglePrecision : Float = 3.342342f     //> piSinglePrecision  : Float = 3.342342
    val doubleValue = piSinglePrecision * 2;
    
    
    // printf style:
    println(f"Pi is about $piSinglePrecision%.3f")  //> Pi is about 3.142
    println(f"Pi Double is about $doubleValue%.3f")  //> Pi is about 6.685
  }  
}