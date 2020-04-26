package com.abbyhowe.LearnFolio.data;

import com.abbyhowe.LearnFolio.models.Assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AssignmentData {

    //holds static methods.
    //this will be the place to hold students.
    private static final Map<Integer, Assignment> assignments = new HashMap<>();

    //gets all students.
    public static Collection<Assignment> getAll(){
        return assignments.values();
    }

    //get a single student.
    public static Assignment getById(int id){
        return (Assignment) assignments.values();
    }

    //add student
    public static void add(Assignment assignment){
        assignments.put(assignment.getId(), assignment);
    }

    //deletes an event
    public static void remove(int id){
        assignments.remove(id);
    }
}
