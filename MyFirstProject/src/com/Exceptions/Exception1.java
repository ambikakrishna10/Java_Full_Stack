package com.Exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] products = {"Mobile", "Laptop", "HeadPhones", "Keyboard"};
		try {
			System.out.print("Enter product Price: ");
			String priceString = sc.nextLine();
			
			double price = Double.parseDouble(priceString);
			
			System.out.print("Enter the product index (0-3): ");
			int index = sc.nextInt();
			
			System.out.print("Enter product quantity: ");
			int quantity = sc.nextInt();
			
			System.out.println("Product: " + products[index]);
			double result = price / quantity;
			
			System.out.println("Price by quantity: " + result);
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Price. Enter Correct price..");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid product index.! Enter correct index..");
		}
		catch(ArithmeticException e) {
			System.out.println("Quantity cannot be zero..");
		}
		finally {
			System.out.println("Order processing completed..");
		}
	}
}
