package com.classReview12;

public class SmartPhone extends Phone implements Weather, Camera {

	public SmartPhone(String serialNr) {
		super(serialNr);
		
	}
    public SmartPhone(String serialNr, String color) {
	super(serialNr);
	super.color=color;
		

}
	@Override
	public void showWeather() {
		System.out.println("Showing the weather.....");
		
	}
	@Override
	public void takesPictures() {
		System.out.println("taking high quality pictures");
		
	}
	@Override
	public void recordVideo() {
		System.out.println("recording a vide0.....");
		
	}
	@Override //from Phone
	public void displayInfor() {
		System.out.println("I am a " +color+ " Smartphone");
	}
	
}
