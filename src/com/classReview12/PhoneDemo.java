package com.classReview12;

public class PhoneDemo {

	
	
	public static void main(String[] args) {
	
		Phone phone=new Phone("123-4565-90");
		phone.text("1234", "Privet");
		phone.call("2344354");
		phone.color="Blue";
		phone.displayInfor();
   // when is private u CANT ACCESS System.out.println(phone.serialNumber );
		System.out.println(phone.getSerialNumber("123456"));
		
		
		System.out.println("Smart phone generation");
		
		//upcasting don implecitly 
		Phone iphone1=new SmartPhone("123435345", "Red");
		iphone1.displayInfor();
		iphone1.call("sfsdgf");
		iphone1.text("353454", "hola");
		
		//downcasting done explicitly
		SmartPhone smartPhone1=(SmartPhone)iphone1;
		smartPhone1.showWeather();
		smartPhone1.takesPictures();
		
		
		
		
		
		
}

}
