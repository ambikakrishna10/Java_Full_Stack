package com.constructors;

public class student {
	int id;
	String name;
	String course;
	int marks;
	
	student(int id, String name, String course, int marks){
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(marks);
	}
	public static void main(String[] args) {
		student s = new student(101, "abc", "java", 1);
		System.out.println("Main method started...");
		s.display();
		System.out.println("Main method ended....");
	}

}
