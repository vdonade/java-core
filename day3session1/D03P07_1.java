package com.learning.core.day3session1;
import java.util.ArrayList;

public class D03P07_1 {
    public static void main(String[] args) {
        // Create an ArrayList of student names
        ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("Jack");
        studentNames.add("Paul");
        studentNames.add("Henry");
        studentNames.add("Mary");
        studentNames.add("Ronaldo");

        // Check if a particular name exists in the list
        String nameToFind = "Henry";
        if (studentNames.contains(nameToFind)) {
            System.out.println("Found. The name " + nameToFind + " exists in the list.");
        } else {
            System.out.println("Not found. The name " + nameToFind + " does not exist in the list.");
        }
    }
}