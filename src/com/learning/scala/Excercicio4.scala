package com.learning.scala

object Excercicio4 {
      def main(args: Array[String]) {
        // EXERCISE
        // Create a list of the numbers 1-20; your job is to print out numbers that are evenly divisible by three. (Scala's
        // modula operator, like other languages, is %, which gives you the remainder after division. For example, 9 % 3 = 0
        // because 9 is evenly divisible by 3.) Do this first by iterating through all the items in the list and testing each
        // one as you go. Then, do it again by using a filter function on the list instead.
        
        val moreNumbers = List.range(1, 21)
        
        for (x <- moreNumbers) {
          val result = x % 3;
          
          if(result == 0){
            println(x)
          }
        } 
      }
}