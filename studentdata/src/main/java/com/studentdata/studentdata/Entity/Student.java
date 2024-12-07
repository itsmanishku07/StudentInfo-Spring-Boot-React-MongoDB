package com.studentdata.studentdata.Entity;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Student {
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String emailId;
    private String address;
    private String imgUrl; 
    private LocalDateTime date;
}