package com.constructors;

public class Bike {
	String company;
	String bikemodel;
	int price;
	int millage;
	
	Bike(){
		this.company = "HeroHonda";
		this.bikemodel = "Splender";
		this.price = 78000;
		this.millage = 70;
	}

	Bike(String company, String bikemodel){
		this.company = company;
		this.bikemodel = bikemodel;
	}
	
	Bike(String company, String bikemodel, int price, int millage){
		this.company = company;
		this.bikemodel = bikemodel;
		this.price = price;
		this.millage = millage;
	}
	
	void display() {
		System.out.println("Company: " + company);
		System.out.println("Bikemodel: " + bikemodel);
		System.out.println("price: " + price);
		System.out.println("millage: " + millage);
	}

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		b1.display();
		System.out.println("***************************");
		
		Bike b2 = new Bike("Honda", "SP125", 120000, 60);
		b2.display();
		System.out.println("***************************");
		
		Bike b3 = new Bike("RE", "Bullet", 300000, 30);
		b3.display();
		System.out.println("***************************");
	}

}
