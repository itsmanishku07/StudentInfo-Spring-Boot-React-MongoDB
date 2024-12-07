package com.studentdata.studentdata.Controller;

import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentdata.studentdata.Entity.Student;
import com.studentdata.studentdata.Service.StudentService;
@CrossOrigin("*")                
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudentData()
    {
        return studentService.getAllStudentData();
    }

    @PostMapping
    public String createStudent(@RequestBody Student student)
    {
        student.setDate(LocalDateTime.now());
        studentService.saveStudent(student);
        return "Data Inserted";
    }

    @GetMapping("/login/{email}/{password}")
    public List<Student> studentLogin(@PathVariable String email, @PathVariable String password, Student student)
    {
        return null;
    }

    @GetMapping("/findbyid/{id}")
    public Student findStudentById(@PathVariable ObjectId id, Student student)
    {
        return studentService.findById(id).orElse(null);
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deleteById(@PathVariable ObjectId id)
    {
        studentService.deleteById(id);
        return "Student Deleted";
    }



}
