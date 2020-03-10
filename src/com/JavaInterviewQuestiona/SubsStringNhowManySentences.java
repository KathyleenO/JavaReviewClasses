package com.JavaInterviewQuestiona;

public class SubsStringNhowManySentences {

	public static void main(String[] args) {
		
		//1 mak string
		String str="I am so tired and cant wait to get a job pretty soon";
		
		// split in array
		System.out.println(str.substring(15));
		String [] array= str.split("");

         //for loop it
		for(String a: array) {
			System.out.println(a);
		}

		String a= "Mi amor Erick es bien blanco del salvador";
		
		String[] m= a.split("");
		
		for(String p: m) {
			System.out.println(p);
		}
		
		
		
		String sentence="I love papas fritas con queso y hamon";
		
		String [] word=sentence.split(" ");
		System.out.println(word.length);
		
		for(String print:word) {
			System.out.print(print);
		
		}
		
		//String
		
		//array/split
		
		//length
		
		//for loop
		
		
		String an="mi amor es erick lopes";
		
		String[] howMany=an.split(" ");
        System.out.println(howMany.length);
        
        for(String n:howMany) {
        	System.out.println(n);
        }
		
		
		
	}

}
