package com.abbyhowe.LearnFolio.repository;

import com.abbyhowe.LearnFolio.models.Assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AssignmentData {

    //holds static methods.
    //this will be the place to hold assignments.
    private static final Map<Long, Assignment> assignments = new HashMap<>();

    //gets all assignments.
    public static Collection<Assignment> getAll() {
        return assignments.values();
    }

    //get a single assignment.
    public static Assignment getById(Long id) {
        return (Assignment) assignments.values();
    }

    //add assignment
    public static void add(Assignment assignment) {
        assignments.put(assignment.getId(), assignment);
    }

    //deletes an assignment
    public static void remove(Long id) {
        assignments.remove(id);
    }
}
