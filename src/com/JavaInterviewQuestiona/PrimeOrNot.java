package com.JavaInterviewQuestiona;

public class PrimeOrNot {

	
	public static void main(String[] args) {
		
		
		int num=3;
		boolean isPrime=true;
		
		for(int i=2; i<num/2; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println( num +"is prime");
		}else {
			System.out.println("not prime" +num);
		}
		
		
		
	
		
		
		
		int numss= 11;
		boolean isPrimes=true;
		
		for(int i=2; i< numss/2;  i++) {
			if(numss%i==0) {
				isPrimes=false;
				break;
			}
			
		}
		
		
		if(isPrimes) {
			System.out.println("prime");
			
		}else {
			System.out.println("not prime");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
