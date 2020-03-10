package com.JavaInterviewQuestiona;

public class AlphaCharacters {

	public static void main(String[] args) {
//		
//		String given="12345hsfkjhdjhf&*%hosdsgjflsd%%^&*#$##@";
//		
//		String replaceCharandNum=given.replaceAll("[^A-Za-z]", "");
//		
//		System.out.println(replaceCharandNum.length());
//		String replaceLetters=given.replaceAll("[A-Za-z]", "");
//		
//		String replaceNums=given.replaceAll("[0-9]", "");
//		
//		String replaceNumsAndLetters=given.replaceAll("[A-Za-z0-9]", "");
//		
//		String replaceSpecialChar=given.replaceAll("\\W", "");   // uppercase W removes special especial characters
//		
//		String removesNUmNLetters=given.replaceAll("\\w", "");  //lower case w removes Numbers and letters
//		
//		System.out.println( replaceCharandNum);
//		
//		System.out.println(replaceLetters);
//		
//		System.out.println(replaceNums);
//		
//		System.out.println(replaceNumsAndLetters);
//		
//		System.out.println(replaceSpecialChar);
//		
//		System.out.println(removesNUmNLetters);
		
		
		
		
		
		String lo="ANHSGGG655$^&$%$#%@Y*8&^$#&";
		String hey=lo.replaceAll("[^a-zA-Z]", "");
		System.out.println(hey);
		
		
		
		
		String hola="hola";
		StringBuffer df=new StringBuffer(hola);
		System.out.println(df.reverse());
	}

}
