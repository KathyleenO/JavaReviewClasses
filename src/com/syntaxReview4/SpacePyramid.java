package com.syntaxReview4;

public class SpacePyramid {

	public static void main(String[] args) {
		//  4 spaces  1  
		// 3 spaces  12
		//  2spaces  123
		// 1 1234
//12345

		
		for(int i=1; i<=5; i++) {
			for(int j=5-i; j>=1; j--) {    //SPACES   5-1=4 then 5-2=3 5-3=2 5-4=1 
			System.out.print(" ");	
			}
			for(int m=1; m<=i; m++) {
				System.out.print(m);
			}
			System.out.println();
		}
		
	
		
		
		
	}

}
