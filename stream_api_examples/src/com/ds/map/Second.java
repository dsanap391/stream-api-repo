package com.ds.map;

import java.util.List;

public class Second {

	public static void main(String[] args) {

		List<Integer> languages = List.of(2,1,3,4,5,4,6);
		
		languages.stream().map(n -> n*n).forEach(System.out::println);
	}
}
