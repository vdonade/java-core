package com.learning.core.day3session2;

	import java.util.HashMap;
	import java.util.Map;

	public class DP0308_2 {
	    
	    public static void main(String[] args) {
	        // Create a HashMap to store phone book details
	        Map<String, String> phoneBook = new HashMap<>();
	        
	        // Add predefined information of 5 phone book details
	        phoneBook.put("Amal", "998787823");
	        phoneBook.put("Manvitha", "937843978");
	        phoneBook.put("Joseph", "7882221113");
	        phoneBook.put("Smith", "8293893311");
	        phoneBook.put("Kathe", "7234560011");
	        
	        // Search for a phone number by name
	        String searchName = "Joseph";
	        if (phoneBook.containsKey(searchName)) {
	            String phoneNumber = phoneBook.get(searchName);
	            System.out.println("Output: " + phoneNumber);
	        } else {
	            System.out.println("Name not found in the phone book.");
	        }
	    }
	}



