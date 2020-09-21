package com.muditha.Dao;

import com.muditha.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1,"Muditha","ICT"));
                put(2, new Student(2,"Claudi","Science"));
                put(3, new Student(3,"Test","Arts"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }


    public Student getStudentById(int id){
        return this.students.get(id);
    }

}
