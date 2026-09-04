package com.logicalStatements;

import java.util.Scanner;

public class LogicalStatements2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a char : ");
		char c = sc.next().charAt(0);
		if(c>='a' && c<='z') {
			System.out.println("Lower case letter..");
		}else if(c>='A' && c<='Z') {
			System.out.println("Uper case letter..");
		}else if(c>='0' && c<='9') {
			System.out.println("Number..");
		}else{
			System.out.println("Special Characters...");
		}
	}

}
