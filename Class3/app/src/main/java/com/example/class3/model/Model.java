package com.example.class3.model;

import java.util.LinkedList;
import java.util.List;

public class Model {
    private static final Model instance = new Model();
    private Model(){
        for (int i=0; i<20; i++){
            Student st = new Student("name " + i, "" + i, " ", false);
        }
    }

    public static Model instance(){
        return instance;
    }

    List<Student> data = new LinkedList<>();

    public List<Student> getAllStudents(){
        return data;
    }

    public void addStudent(Student st) {
        data.add(st);
    }

}
