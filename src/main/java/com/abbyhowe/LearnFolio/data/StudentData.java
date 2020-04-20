package com.abbyhowe.LearnFolio.data;

import com.abbyhowe.LearnFolio.models.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentData {
    //holds static methods.
    //this will be the place to hold students.
    private static final Map<Integer, Student> students = new HashMap<>();

    //gets all students.
    public static Collection<Student> getAll(){
        return students.values();
    }

    //get a single student.
    public static Student getById(int id){
        return (Student) students.values();
    }

    //add student
    public static void add(Student student){
        students.put(student.getId(), student);
    }

    //deletes an event
    public static void remove(int id){
        students.remove(id);
    }
}
