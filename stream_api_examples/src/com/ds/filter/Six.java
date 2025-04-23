package com.ds.filter;

import java.util.List;

public class Six {

	public static void main(String[] args) {

		List<Employee> employees = List.of(new Employee("Alice", 30, "HR", 30000,"Pune"), new Employee("Bob", 25, "IT", 50000,"Mumbai"),
				new Employee("Charlie", 35, "HR", 40000,"Hydarabad"), new Employee("David", 28, "IT", 55000,"Bangalore"),
				new Employee("Eve", 45, "Finance", 60000,"Chennai"),new Employee("Devansh", 23, "IT", 65000,"Pune"),
				new Employee("Aniket", 25, "Finance", 34000,"Mumbai"),new Employee("Rushikesh", 27, "HR", 40000,"Hydarabad"),
				new Employee("Shantanu", 20, "Finance", 25000,"Mumabi"));
		
		employees.stream().filter(e -> e.getSalary() > 50000).forEach(System.out::println);
	}
}
