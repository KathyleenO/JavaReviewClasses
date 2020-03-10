package com.SyntaxClass4;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {
		// //   Task One
        //Write a program using a do while loop to print out all odd number from 0 15 
		
		
	    //   Task Two
	  //  *keep asking user to pay for candy until entered price is not equal to 3
	   //  *after user got a write amount print "Please enjoy your candy"*/  TODO Auto-generated method stub

//		
//		int a=1;
//		do {
//			System.out.println(a);
//			a+=2;
//		}while(a<=15);
//		
//		if(i%2=1) {
//			System.out.println();
//		}
		
		
		System.out.println("***************");
		
		Scanner scan=new Scanner(System.in);
		
		int price;
		do {
			System.out.println("Please pay for candy");
			price=scan.nextInt();
			
		}while(price!=3);
		System.out.println("enjoy your candy");
		
		
		
		
		
	}

}
