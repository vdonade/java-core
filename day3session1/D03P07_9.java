package com.learning.core.day3session1;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Id-" + id + ", name-" + name + ", age-" + age + ", salary-" + salary;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return id;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    // Override compareTo method
    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.id, person.id);
    }
}

public class D03P07_9 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        // Adding predefined information of 6 person details
        treeSet.add(new Person(1, "John", 30, 5000.0));
        treeSet.add(new Person(2, "Jane", 25, 6000.0));
        treeSet.add(new Person(3, "Jack", 35, 7000.0));
        treeSet.add(new Person(4, "Jones", 22, 6999.0));
        treeSet.add(new Person(5, "Jill", 28, 5500.0));
        treeSet.add(new Person(6, "Jim", 40, 8000.0));

        // Printing the First Person whose name starts with J
        for (Person person : treeSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}