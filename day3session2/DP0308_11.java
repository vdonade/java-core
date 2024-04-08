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
	        return id + " " + name + " " + designation + " " + department;
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

	public class DP0308_11 {
	    public static void main(String[] args) {
	        // Create Hashtable to store Employee details with employee id as the key
	        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

	        // Add predefined information of 4 Employee details
	        employeeTable.put(1001, new Employee(1001, "Daniel", "L&D", "Analyst"));
	        employeeTable.put(1002, new Employee(1002, "Thomas", "Testing", "Tester"));
	        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
	        employeeTable.put(1004, new Employee(1004, "Grace", "HR", "Tech Support"));

	        // Add new Employees if not exists
	        addEmployeeIfNotExists(employeeTable, 1005, "Charles", "Testing", "QA Lead");
	        addEmployeeIfNotExists(employeeTable, 1006, "Michael", "Development", "Software Engineer");

	        // Print all Employee details
	        System.out.println("Employee Details:");
	        for (Employee employee : employeeTable.values()) {
	            System.out.println(employee);
	        }
	    }

	    // Method to add Employee if not exists in the Hashtable
	    private static void addEmployeeIfNotExists(Hashtable<Integer, Employee> employeeTable, int id, String name, String department, String designation) {
	        if (!employeeTable.containsKey(id)) {
	            employeeTable.put(id, new Employee(id, name, department, designation));
	        }
	    }
	}



