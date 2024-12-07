package com.studentdata.studentdata.Repositry;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.studentdata.studentdata.Entity.Student;

public interface StudentRepositry extends MongoRepository<Student, ObjectId>{
    
}
