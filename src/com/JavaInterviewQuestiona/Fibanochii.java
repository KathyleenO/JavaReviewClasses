package com.JavaInterviewQuestiona;

public class Fibanochii {

	public static void main(String[] args) {
		
		
		int a=1, b=0, c;
		
		for(int i=0; i<10; i++) {
			System.out.print(a  +" ");
			c=a+b;
			a=b;
			b=c;
		}
	
	}

}
