package com.mdream.studyup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mdream.studyup.mapper")
public class StudyupApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyupApplication.class, args);
	}

}
