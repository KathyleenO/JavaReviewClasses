package com.syntaxdatatypes;

import java.util.Scanner;

public class BetterCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a=10;
//		int b=12;
//		String name1="john";
//		String name2="Smith";
//		System.out.println(name1.equals(name2));
		
		Scanner scan=new Scanner(System.in);
		System.out.print("enter first number");
		int firstNum=scan.nextInt();
		System.out.println("enter second number");
		int second=scan.nextInt();
		System.out.println("enter in operator");
		String operator=scan.next();
		
		if(operator.equals("+")) {
			System.out.println(firstNum+second);
		}else if(operator.equals("-")) {
			System.out.println(firstNum-second);
		}else if(operator.equals("/")) {
			System.out.println(firstNum/second);
		}else if(operator.equals("*")) {
			System.out.println(firstNum*second);
		
		}	
		scan.close();
	}

}
