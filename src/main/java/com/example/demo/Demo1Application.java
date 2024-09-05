package com.example.demo;

import com.example.demo.model.LomObj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        LomObj lomObj = LomObj.builder().id(1).name("colin").build();
        System.out.println(lomObj.toString());
    }

    
}
