package com.example.sessiondemo;

import javax.servlet.http.HttpSessionListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.sessiondemo.MySessionListener;

@SpringBootApplication
public class SessionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionDemoApplication.class, args);
	}
	
	/*
	@Bean
	public HttpSessionListener mySessionListener() {
		return new MySessionListener();
	}*/

}
