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
        return "Id-" + id + ", name-" + name + ", age " + age + ", salary-" + salary;
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

    public static Comparator<Person> AgeComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.age, p2.age);
        }
    };
}

public class D03P07_5 {
    public static void main(String[] args) {
        // Create a TreeSet of Person objects with natural sorting based on id
        TreeSet<Person> persons = new TreeSet<Person>();

        // Add predefined information of 6 person details to the TreeSet
        persons.add(new Person(1, "James", 22, 1999));
        persons.add(new Person(2, "Mike", 30, 2999));
        persons.add(new Person(3, "David", 28, 2499));
        persons.add(new Person(4, "Michelle", 25, 2299));
        persons.add(new Person(5, "John", 32, 1999));
        persons.add(new Person(6, "Tom", 42, 3999));

        // Print all the person details whose age is greater than 25
        System.out.println("Persons with age greater than 25:");
        for (Person person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}