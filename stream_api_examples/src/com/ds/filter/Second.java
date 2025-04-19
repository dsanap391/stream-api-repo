package com.ds.filter;

import java.util.List;
import java.util.stream.Collectors;

//find the name which has more than 4 five character

public class Second {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Ankit", "Arun", "Steve","Chinamay","Devansh","Farhan","Haridas","Irfan","Jullie",
									"Karan","Lalit","Mahesh","Nayan","Pravin","Rajesh","Soham","Tushar","Umesh","Varun","Yogesh");
		List<String> nameList =	names.stream().filter(n -> n.length() > 5).collect(Collectors.toList());
		System.out.println(nameList);
	}
}
