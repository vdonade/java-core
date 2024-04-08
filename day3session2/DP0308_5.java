package com.learning.core.day3session2;


	import java.util.*;

	class Car implements Comparable<Car> {
	    private String name;
	    private double price;

	    public Car(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    // Getters and setters

	    @Override
	    public String toString() {
	        return name + " " + price;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, price);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Car car = (Car) obj;
	        return Double.compare(car.price, price) == 0 &&
	                Objects.equals(name, car.name);
	    }

	    @Override
	    public int compareTo(Car other) {
	        return Double.compare(this.price, other.price);
	    }
	}

	public class DP0308_5 {
	    public static void main(String[] args) {
	        // Create TreeMap to store Car details sorted by price
	        TreeMap<Car, Integer> carMap = new TreeMap<>();

	        // Add predefined information of 4 Car details
	        carMap.put(new Car("Bugatti", 80050.0), 88);
	        carMap.put(new Car("Swift", 305000.0), 100);
	        carMap.put(new Car("Audi", 600100.0), 200);
	        carMap.put(new Car("Benz", 900000.0), 150);

	        // Retrieve all car details
	        System.out.println("Car Details:");
	        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
	            System.out.println(entry.getKey() + "\n" + entry.getValue() + "\n");
	        }
	    }
	}


