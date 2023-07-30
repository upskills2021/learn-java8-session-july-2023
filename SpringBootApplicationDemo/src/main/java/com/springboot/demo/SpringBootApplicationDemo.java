package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootApplicationDemo {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootApplicationDemo.class, args);
		BusinessService businessService = context.getBean(BusinessService.class);
		businessService.apply(Arrays.asList(1,4,3,2,7,5,6));
	}

}
