package com.projects.Sms.Controller;

import com.projects.Sms.Entity.Student;
import com.projects.Sms.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    private StudentService studentService;


    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }


    //handler method to handle method and view
    @GetMapping("/students")
    public String StudentList(Model model)
    {
        model.addAttribute("students", studentService.getAllStudents());

        //We are returning the model attribute as students for which a file in that name is created
        return "students";
    }

    //This URL is linked or added exactly as the one mentioned in the HTML file for button <a href>
    @GetMapping("/students/new")
    public String createStudentForm(Model model){

        //creating a student object to hold the info for the form
        Student student = new Student();
        model.addAttribute("student", student);
        return "studentForm";
    }


    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
       studentService.saveStudent(student);
       return "redirect:/students";   // redirecting the results to the students html form
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable long id, Model model){
      model.addAttribute("student", studentService.getStudentById(id));
      return "edit_student";
    }


    @PostMapping("/students/{id}")
    public String UpdateStudent( @PathVariable long id,@ModelAttribute("student") Student student , Model model){

        //get student by id
        Student ExistingStudent = studentService.getStudentById(id);
        ExistingStudent.setId(id);
        ExistingStudent.setFirstName(student.getFirstName());
        ExistingStudent.setLastName(student.getLastName());
        ExistingStudent.setEmail(student.getEmail());
        ExistingStudent.setPhone(student.getPhone());
        ExistingStudent.setAddress(student.getAddress());
        ExistingStudent.setAge(student.getAge());
        studentService.updateStudent(ExistingStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable long id){
        studentService.deleteStudentbyId(id);
        return "redirect:/students";
    }
}
