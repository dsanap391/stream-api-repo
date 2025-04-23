package com.ds.filter;

import java.util.Arrays;
import java.util.List;

public class Four {

//find the even numbers from the given array 
	
	public static void main(String[] args) {
	/*
	 * Using array
	 * 
		int[] arr= {1, 2, 3, 4, 5, 6,8,9,12,13,16};
		
		int[] evenNum = Arrays.stream(arr).filter(n -> n%2==0).toArray();
		System.out.println(Arrays.toString(evenNum));
	*/
		
		//Using List	
		
		List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5, 6,8,9,12,13,16);
		
		List<Integer> list =numbers.stream().filter(n -> n%2 == 0).toList();
		
		System.out.println(list);
	}
}
