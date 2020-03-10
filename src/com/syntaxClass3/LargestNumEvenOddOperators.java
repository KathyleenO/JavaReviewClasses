package com.syntaxClass3;

public class LargestNumEvenOddOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ex  Class notes.
        /* if number is between 1-10 -->this number is small
         * if number is between 10-100 --> this number is medium
         * if number is between 100-1000 --> this number is large
         * any other number --> is out of the range
         */
//      int num=200;
////            true AND false --> false
//      if (num>1 && num <10) {
//      System.out.println("this number is small");
//      // true AND false --> false
//      }else if (num>=10 && num<100) {
//      System.out.println("this number is medium");
//      //true AND true --> true
//      }else if (num>=100 && num <1000) {
//      System.out.println("this number is large");
//      }else {
//      System.out.println("Number is out of our the range");
//      }
		
		
		//Write a program to find if a number is even or odd 
	       //Print out  "My number must be even" or "My number must be odd" 
	        // Must use if else
		
		
		int num=10;
		
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		
		int a=1000;
		int b=60;
		int c=90;
		
		if(a>b && a>c) {
			System.out.println("largest num is" +a);
		}else if(b>a && b>c) {
		System.out.println("largest num is " +b);
		}else if(c>a && c>b) {
		System.out.println(" largest num is " +c);
		}
		
		
		
		
	}

}
