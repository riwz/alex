package com.company;
import  java.util.ArrayList;
import java.util.List;
public class Manager {
    public List<Student> Student(List<Student> student, String name){
        List<Student> result = new ArrayList<>();
        for (Student student1: student){
            if (student.get().equals(name)) {
            }
            result.add(student1);
        }
    }
}