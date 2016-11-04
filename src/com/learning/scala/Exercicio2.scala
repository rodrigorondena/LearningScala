package com.learning.scala

object Exercicio2 {
    def main(args: Array[String]) {
      	 // EXERCISE
	       // Write some code that prints out the first 10 values of the Fibonacci sequence.
	       // This is the sequence where every number is the sum of the two numbers before it.
	       // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	       
         var atual = 0
         var anterior = 0
         for (x <- 0 to 10) {
           if(x == 1){
             atual = 1;
             anterior = 0;
           }
           else{
             atual += anterior;
             anterior = atual - anterior;
           }
           if(x < 10){
             println(atual);
           }
         }                
      
    }
}