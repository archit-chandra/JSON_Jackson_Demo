package com.archit.json.demo;

import com.archit.json.demo.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        try {

            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            //read JSON file and map/convert to Java POJO from sample-lite.json
            Student student = mapper.readValue(
                    new File("data/sample-lite.json"),
                    Student.class);

            // print out first & last name from POJO
            System.out.println("Student First Name : " + student.getFirstName());
            System.out.println("Student Last Name  : " + student.getLastName());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
