package com.learning.core.day3session1;
import java.util.Comparator;
import java.util.Objects;
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

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return id == other.id && Objects.equals(name, other.name) && age == other.age && salary == other.salary;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

    public static Comparator<Person> SalaryComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return Double.compare(p1.salary, p2.salary);
        }
    };
}

public class D03P07_6 {
    public static void main(String[] args) {
        // Create a TreeSet of Person objects with natural sorting based on id
        TreeSet<Person> persons = new TreeSet<Person>();

        // Add predefined information of 6 person details to the TreeSet
        persons.add(new Person(1, "Jerry", 25, 999));
        persons.add(new Person(2, "Smith", 30, 2999));
        persons.add(new Person(3, "Popeye", 40, 5999));
        persons.add(new Person(4, "Jones", 45, 6999));
        persons.add(new Person(5, "John", 22, 1999));
        persons.add(new Person(6, "Tom", 35, 3999));

        // Print the id, name, and salary of each Person object in the TreeSet
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}