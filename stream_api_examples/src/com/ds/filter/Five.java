package com.ds.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Five {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(1,-2,3,5,-3,0,5,-7,6,8);
		
		List<Integer> list = numbers.stream().filter(n -> n < 0).collect(Collectors.toList());
		System.out.println(list);
	}
}
