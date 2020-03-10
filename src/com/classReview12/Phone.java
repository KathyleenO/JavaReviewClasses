package com.classReview12;

public class Phone {

	private String serialNumber;
	
	
	
	//GETTERS AND SETTER USE source getters ans setters
	public String getSerialNumber(String password) {
		String result;
		
		if(password.equals("123456")) {
		result=serialNumber;
		}else {
			result="Access Denied";
		}
		return result;
	}



	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	String color;
	
	public Phone(String serialNr) {
		serialNumber=serialNr;
		
		
		
	}
	
	
	
	public void text(String number, String text) {
		System.out.println("Sending " +text+ "to " + number);
	}
	public void call(String number) {
		System.out.println("Calling " +number);
	}
	
	public void displayInfor() {
		System.out.println("I am a " +color+ " phone. Serial number is " +serialNumber);
	}
	
}
