package com.studentdata.studentdata.Service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studentdata.studentdata.Entity.Student;
import com.studentdata.studentdata.Repositry.StudentRepositry;

@Component
public class StudentService {

    @Autowired
    private StudentRepositry studentRepositry;

    public void saveStudent(Student student)
    {
        studentRepositry.save(student);
    }

    public List<Student> getAllStudentData()
    {
        return studentRepositry.findAll();
    }

    public Optional<Student> findById(ObjectId id)
    {
        return studentRepositry.findById(id);
    }

    

    public void deleteById(ObjectId id)
    {
        studentRepositry.deleteById(id);
    }

}
