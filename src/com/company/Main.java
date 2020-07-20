package com.company;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Alesha",1);
        Student s2 = new Student("bob",2);
        Student s3 = new Student("Ray",3);

        List<Student> student = Arrays.asList(s1, s2, s3);

        Manager manager = new Manager();
        System.out.println("test ");
        List<Student> N = manager.Student(student, "Alesha");

    }

}

