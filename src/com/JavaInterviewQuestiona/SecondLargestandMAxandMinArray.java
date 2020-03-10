package com.JavaInterviewQuestiona;

import java.util.Arrays;

public class SecondLargestandMAxandMinArray {

	public static void main(String[] args) {
		
		
		
		int [] a= {7,90,80,6};
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		
		int [] u= {90,100,300,40};
		Arrays.sort(u);
		System.out.println(u[u.length-1]);
		System.out.println(u[u.length-2]);
		System.out.println(u[u.length-3]);
		
		
		
		int [] at= {500,90,100};
		
		int largest=at[0];
		int second=0;
		
		for(int i=0; i<at.length-1; i++) {
			if(at[i]>largest) {
				second=largest;
				largest=at[i];
			}else if(at[i]>second && a[i]!=largest) {
				second=at[i];
			}
		}
		
//		
//		
//		
//		int[] array = {9,20,70,90,800};
//		
//		int largest= array[0];
//		int second= 0;
//		
//		for(int i=0; i< array.length; i++) {
//			if(array[i]> largest) {
//				second=largest;
//				largest=array[i];
//			}else if(array[i]> second && array[i] !=largest ) {
//				second=array[i];
//			}
//		}
//		System.out.println(largest);
//		System.out.println(second);
//		
//
//		
//		int[] arrays= {100,200, 300,5000};
//		
//		int largests=arrays[0];
//		int secondLargest=0;
//		
//		for(int i=0; i< arrays.length; i++) {
//			if(arrays[i]> largests) {
//				secondLargest=largests;
//				largests=arrays[i];
//			}else if(arrays[i]> secondLargest && array[i] !=largests) {
//				secondLargest=array[i];
//			}
//		}
//		
//		
//		
//		Arrays.sort(arrays);
//		
//		System.out.println(arrays[arrays.length-1] +" This prints out LARGEST WHEN USE -1");
//		
//		System.out.println(arrays[arrays.length-2] + "This is SECOND LARGEST WHEN USE -2");
//		
////		System.out.println(arrays[arrays.length-4] + "This is minimum number");
//		
//		
//		
//		
//		Arrays.sort(arrays);
//		System.out.println(arrays[arrays.length-1]);
//		System.out.println(arrays[arrays.length-2]);
//		
//		
//		
//		int [] arrayFin = {10, 9, 8, 7, 6, 80};
//		
//		int largestt=arrayFin[0];
//		int SecondN=0;
//		
//		for(int i=0; i< arrayFin.length; i++) {
//			if(arrayFin[i]> largestt) {
//				SecondN=largestt;
//				largestt=arrayFin[i];		
//			} else if (arrayFin[i]> SecondN && arrayFin[i] !=largestt ) {
//				SecondN=array[i];
//			}
//		}
//		
//		
//		System.out.println(largestt);
//		System.out.println(SecondN);
		
		
		
	}

}
