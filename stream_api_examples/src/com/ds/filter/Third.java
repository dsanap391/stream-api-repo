package com.ds.filter;

import java.util.List;
import java.util.stream.Collectors;

//Remove empty strings from list of string

public class Third {

	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Ankit", "Arun", "Steve","Chinamay","Devansh","","Haridas","","Jullie");
		List<String> list = names.stream().filter(n -> !n.isEmpty()).collect(Collectors.toList());
		System.out.println(list);
	}
}
