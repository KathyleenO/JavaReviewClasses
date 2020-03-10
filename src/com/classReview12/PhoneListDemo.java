package com.classReview12;

import java.util.ArrayList;

public class PhoneListDemo {
 
public static void main(String[] args) {
	

	ArrayList<Phone>phonelist=new ArrayList<>();
	System.out.println(phonelist.size());
	
	//ADDING PHONE IN ARRAYLSIT 2 step 
	
	Phone phone1=new Phone("1");  //STEP 1
	phonelist.add(phone1);//STEP 2
	
	
	//OR ONE STEP (SAME AS ABOVE)
	phonelist.add(new Phone("2"));
	
	// 2 STEPS TO FIND SIZE
	int size=phonelist.size();
	System.out.println(size);
	
	//OR ONE STEP  TO FIND SIZE
	System.out.println(phonelist.size());
	
	
	SmartPhone iphone1=new SmartPhone("24334", "White");
	
	//UPCASTING    smartphone to Phone
//	Phone phone2=iphone1;
//	phonelist.add(phone2);
	
	
	phonelist.add(iphone1); //addding to arraylsit, from above SmartPhone iphone1=new SmartPhone("24334", "White");
	
	System.out.println(phonelist.size());
	
//	Phone thirdSmartPhone=phonelist.get(2);
//	
//	SmartPhone thirdSmartPhone=(SmartPhone)thirdSmartPhone;
//	//printing with loop 
	
	for(int i=0; i<phonelist.size(); i++) {
		System.out.println(phonelist.get(i));
//		Phone phone=phonelist.get(i);
//		phone.displayInfor();
	}
		
	
	System.out.println("--------------");
	for(Phone printPhones:phonelist) {
		printPhones.displayInfor();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
}
