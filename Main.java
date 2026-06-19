// package com.example;

public class Main {
    public static void main(String[] args) {

        //create course
        Course course1 = new Course("C101", "Java Programming", 40, "Beginner", 3);
        Course course2 = new Course("C102", "Data Structures", 50, "Intermediate", 4);
        course1.printSummary();
        course2.printSummary();
    }
}
