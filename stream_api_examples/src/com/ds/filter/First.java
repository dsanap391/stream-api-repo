package com.ds.filter;

import java.util.List;
import java.util.stream.Collectors;

// Find the name starting with character 'A'

public class First {
	public static void main(String[] args) {
		
		List<String> names = List.of("Alice", "Bob", "Ankit", "Arun", "Steve","Chinamay","Devansh");
		List<String> listNames = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(listNames);
	}
}
