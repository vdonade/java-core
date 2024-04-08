package com.learning.core.day3session2;


	import java.util.*;

	class Employee {
	    private int id;
	    private String name;
	    private String department;
	    private String designation;

	    public Employee(int id, String name, String department, String designation) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.designation = designation;
	    }

	    // Getters and setters

	    @Override
	    public String toString() {
	        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, name, department, designation);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Employee employee = (Employee) obj;
	        return id == employee.id &&
	                Objects.equals(name, employee.name) &&
	                Objects.equals(department, employee.department) &&
	                Objects.equals(designation, employee.designation);
	    }
	}

	public class DP0308_9 {
	    public static void main(String[] args) {
	        // Create HashTable to store Employee details with employee id as the key
	        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

	        // Add predefined information of 4 Employee details
	        employeeTable.put(1, new Employee(101, "John Doe", "Engineering", "Software Engineer"));
	        employeeTable.put(2, new Employee(102, "Jane Smith", "Marketing", "Marketing Manager"));
	        employeeTable.put(3, new Employee(103, "Alice Johnson", "Finance", "Financial Analyst"));
	        employeeTable.put(4, new Employee(104, "Bob Williams", "HR", "HR Manager"));

	        // Verify whether the HashTable is empty or not
	        boolean isEmpty = employeeTable.isEmpty();
	        System.out.println(isEmpty);
	    }
	}


