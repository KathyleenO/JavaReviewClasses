package com.syntaxReview4;

public class NestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	for(int k=1; k<=4; k++) {
		for(int l=1; l<=6; l++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	for( int floor=1; floor<=4; floor++) {
		System.out.print("floor" +floor + "==");
		for(int room=1; room<=6; room++) {
			System.out.print(floor+ "." +room+ " ");
			System.out.print(room);
		}
	}
	
	
	
	
	
		
	}

}
