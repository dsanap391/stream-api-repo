package com.ds.map;

import java.util.List;

public class First {

	public static void main(String[] args) {
		List<String> languages = List.of("Java","Python","JavaScript","Php","C#","Golang");
		
		languages.stream().map(l -> l.toUpperCase()).forEach(System.out::println);
	}
}
