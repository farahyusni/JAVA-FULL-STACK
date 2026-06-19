// package com.example;

public class Main {
    public static void main(String[] args) {

        //syntax to create object of a class
        //ClassName objectName = new ClassName();
        //ClassName and ConstructorName should be same

        Instructor instructor1 = new Instructor("I101", "John Doe", "Java Programming");
        Instructor instructor2 = new Instructor("I102", "Jane Smith", "Data Structures");

        //create course
        Course course1 = new Course("C101", "Java Programming", 40, "Beginner", 3);
        Course course2 = new Course("C102", "Data Structures", 50, "Intermediate", 4);
        course1.printSummary();
        course2.printSummary();

        Student student1 = new Student("S101", "Alice Johnson", "alice@example.com");
        Student student2 = new Student("S102", "Bob Smith", "bob@example.com");

        course1.setInstructor(instructor1);
        course2.setInstructor(instructor2);

        System.out.println("Instructor Profiles:");
        course1.printSummary();
        course2.printSummary();

        System.out.println("\nStudent Profiles:");
        student1.printProfile();
        student2.printProfile();
    }
}
