package com.projects.Sms.ServiceImpl;

import com.projects.Sms.Entity.Student;
import com.projects.Sms.Repository.StudentRepository;
import com.projects.Sms.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentbyId(long id) {
    studentRepository.deleteById(id);
    }

    @Override
    public Student getStudentById(long id) {

      return studentRepository.findById(id).get();

    }
}
