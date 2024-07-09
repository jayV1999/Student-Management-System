package com.projects.Sms.Service;

import com.projects.Sms.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudentbyId(long id);

    Student getStudentById(long id);
}
