package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

//mvn spring-boot:run
//create database demo;
//use demo;
//create table login(username varchar(50)  , password varchar(50));
//select * from login;
