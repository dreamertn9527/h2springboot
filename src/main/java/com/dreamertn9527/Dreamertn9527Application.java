package com.dreamertn9527;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dreamertn9527")
public class Dreamertn9527Application {

	public static void main(String[] args) {
		SpringApplication.run(Dreamertn9527Application.class, args);
	}
}
