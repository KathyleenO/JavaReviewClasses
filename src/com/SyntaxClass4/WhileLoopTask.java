package com.SyntaxClass4;

import java.util.Scanner;

public class WhileLoopTask {

	public static void main(String[] args) {
		
		
		/*
	     //	Task One	
		/* print only even numbers from 1 to 20 */
		
		
		//Task Two
		/* how to print numbers from 5 to 25 inclusive all in 1 line with space in
		         * between?
				 
				 
				 //Task Three 
	 
	 
	 */
		/* Prompt the user to ask the name 3 times and print "Hello____" */
		
//         int e=2;
//		
//		while(e<=20) {
//			System.out.println(e);
//			
//			e+=2;
//		}
//		
//		int a=5;
//		
//		while(a<=25) {
//			System.out.print(a+ " ");
//			a++;
//			
//		}
//	
		
		Scanner scan=new Scanner(System.in);	
     
	
		int num=1;
	 while(num<=3) {
		   System.out.println("print your name");
		  String name=scan.next();
		 System.out.println("Hello" +name);		 
		 num++;
	}
		
		
		
		
		
	}

}
