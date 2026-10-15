package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Example2 {

	public static void main(String[] args) {
		
		Collection<String> teamA = new ArrayList<>();
		teamA.add("Rohit");
		teamA.add("Kohli");
		teamA.add("Dhoni");
		teamA.add("Sachin");
		
		Collection<String> teamB = new ArrayList<>();
		teamB.add("Abhishek");
		teamB.add("Tilak");
		teamB.add("Nitish");
		teamB.add("Jaishwal");
		
		Collection<String> Team = new ArrayList<>();
		Team.addAll(teamA);
		Team.addAll(teamB);
		System.out.println(Team);
		
		teamB.clear();
		
		System.out.println(teamA.equals(teamB));
		
		System.out.println(teamA.isEmpty());
		
		System.out.println(teamB.isEmpty());
		
		teamA.remove("Kohli");
		System.out.println(teamA);
		
	}
}
