package com.example.arraysdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ArraysDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArraysDemoApplication.class, args);
        var numbers = new Array(3);
        numbers.insertItem(10);
        numbers.insertItem(20);
        numbers.insertItem(41);
        numbers.insertItem(40);
        numbers.printArray();

        System.out.println("****************** Inserting Item at Index *****************************");
        numbers.insertAt(23,1);

        numbers.printArray();
    }

}
