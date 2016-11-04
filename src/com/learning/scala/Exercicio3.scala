package com.learning.scala

object Exercicio3 {
    def main(args: Array[String]) {

        // EXERCISE
        // Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
        // Write a function that converts a string to upper-case, and use that function of a few test strings.
        // Then, do the same thing using a function literal instead of a separate, named function.
      
        
        def upperCase(x: String) {
          println(x.toUpperCase);
          
        }

        upperCase("rodrigo alves rondena");
    }  
}