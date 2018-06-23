package com.archit.json.demo;

import com.archit.json.demo.entity.Address;
import com.archit.json.demo.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        try {

            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            //read JSON file and map/convert to Java POJO from sample-lite.json
            /*Student student = mapper.readValue(
                    new File("data/sample-lite.json"),
                    Student.class);*/
            Student student = mapper.readValue(
                    new File("data/sample-full.json"),
                    Student.class);

            // print out first & last name from POJO
            System.out.println("Student First Name : " + student.getFirstName());
            System.out.println("Student Last Name  : " + student.getLastName());

            // print out address
            Address address = student.getAddress();
            System.out.println("\nAdress");
            System.out.println("---------------");
            System.out.println("Street  : " + address.getStreet());
            System.out.println("City    : " + address.getCity());
            System.out.println("State   : " + address.getState());
            System.out.println("Country : " + address.getCountry());
            System.out.println("Zip     : " + address.getZip());

            // print out languages
            System.out.println("\nLanguages");
            System.out.println("---------------");
            for (String language : student.getLanguages()) {
                System.out.println("Language : " + language);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
