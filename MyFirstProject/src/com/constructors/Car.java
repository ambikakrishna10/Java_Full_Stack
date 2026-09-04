package com.constructors;

public class Car {
	String company;
	String model;
	double price;
	int millage;
	
	Car(){
		System.out.println("no arg constructor");
	}

	public Car(String company, String model) {
		this(company, model, 3000000.0);
	}

	public Car(String company, String model, double price) {
		this(company, model, price, 20);
	}

	public Car(String company, String model, double price, int millage) {
		this.company = company;
		this.model = model;
		this.price = price;
		this.millage = millage;
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.carinfo();
		
		Car c1 = new Car("Audi", "A3");
		c1.carinfo();
		
		Car c2 = new Car("BMW", "M4", 2000000.0);
		c2.carinfo();
		
		Car c3 = new Car("Roll Royce", "Cullian", 35000000.0, 15);
		c3.carinfo();
		
	}
	
	void carinfo() {
		System.out.println("Company: " + company);
		System.out.println("model: " + model);
		System.out.println("price: " + price);
		System.out.println("millage: " + millage);
		System.out.println("********************");
	}

}
