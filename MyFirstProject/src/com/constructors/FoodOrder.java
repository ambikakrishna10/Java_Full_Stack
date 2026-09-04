package com.constructors;

public class FoodOrder {
	int orderId;
	String customerName;
	String restaurantName;
	String itemName;
	int quantity;
	int price;
	
	FoodOrder(int orderId, String customerName, String itemName){
		this.orderId = orderId;
		this.customerName = customerName;
		this.itemName = itemName;
	}
	
	FoodOrder(int orderId, String customerName, String itemName, String restaurantName, int quantity){
		this.orderId = orderId;
		this.customerName = customerName;
		this.itemName = itemName;
		this.restaurantName = restaurantName;
		this.quantity = quantity;
	}
	
	FoodOrder(int orderId, String customerName, String itemName, String restaurantName, int quantity, int price){
		this.orderId = orderId;
		this.customerName = customerName;
		this.itemName = itemName;
		this.restaurantName = restaurantName;
		this.quantity = quantity;
		this.price = price;
	}
	
	void display() {
		System.out.println("Order id: " + orderId);
		System.out.println("Customer name: " + customerName);
		System.out.println("Item name:" + itemName);
		System.out.println("Restaurant name: " + restaurantName);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price : " + price);
	}
	
	
	public static void main(String[] args) {
		
		FoodOrder order1 = new FoodOrder(101, "Siva", "Chicken biryani");
		order1.display();
		System.out.println("***************************************");
		
		FoodOrder order2 = new FoodOrder(102, "Reddy", "Mutton biryani", "Paradise", 2);
		order2.display();
		System.out.println("***************************************");
		
		FoodOrder order3 = new FoodOrder(103, "Kumar", "Fried rice", "Mehfil", 3, 450);
		order3.display();
		System.out.println("***************************************");
	}

}
