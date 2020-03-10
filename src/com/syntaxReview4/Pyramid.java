package com.syntaxReview4;

public class Pyramid {

	public static void main(String[] args) {

		
		//BAD WAY
		
		System.out.println("1");
		System.out.println("12");
		System.out.println("123");
		System.out.println("1234");
		System.out.println("12345");
		System.out.println("____________");
		
		
		
		// SERIOUS WAY
		
		
		for (int row=1; row<=5; row++) {
			//System.out.print(row);
			for(int colum=1; colum<=row; colum++ ) {
				System.out.print(colum);
			}
			System.out.println();
		}
		
		//ODD NUMBER
		
		for (int row=1; row<=5; row++) {
			//System.out.print(row);
			for(int colum=1; colum<=row; colum++ ) {
				System.out.print(2* colum -1);
			}
			System.out.println();
		}
		
		//SQUARE 
		
		for (int row=1; row<=5; row++) {
			//System.out.print(row);
			for(int colum=1; colum<=row; colum++ ) {
				System.out.print(colum* colum);
			}
			System.out.println();
		}
		
	}

}
