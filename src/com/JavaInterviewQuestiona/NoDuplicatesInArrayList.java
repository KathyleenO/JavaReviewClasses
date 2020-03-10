package com.JavaInterviewQuestiona;

import java.util.ArrayList;
import java.util.HashSet;

public class NoDuplicatesInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> alist=new ArrayList();
		alist.add("Kathy");
		alist.add("Job");
		alist.add("Elena");
		alist.add("Kathy");
		alist.add("Erick");
		alist.add("Erick");
		alist.add("Karla");
		alist.add("Cristian");
		alist.add("Amor");
		
		
		HashSet<String>set=new HashSet(alist);
		System.out.println(set);

		
		
		// SECOND WAY 
		
		HashSet<String> sets=new HashSet();
		
		for(String noDuplicates: alist) {
			
			sets.add(noDuplicates);
		}

		System.out.println(sets);
	}

}
