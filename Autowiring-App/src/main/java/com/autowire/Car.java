package com.autowire;

public class Car {
	
	private DieselEngine dieselEng;
	
	public void setDieselEng(DieselEngine dieselEng) {
		System.out.println("setDieselEng() method executed...!");
		this.dieselEng = dieselEng;
	}

	public Car(DieselEngine dieselEng) {
		System.out.println("Car :: param-constructor..!");
		this.dieselEng=dieselEng;
	}
	
	public Car() {
		System.out.println("Car :: 0-param-constructor..!");
	}
	
	public void drive() {
		int start= dieselEng.start();
		if(start>=1) {
			System.out.println("journey started ...!");
		}else {
			System.out.println("Engine failed to start...!");
		}
	}

}
