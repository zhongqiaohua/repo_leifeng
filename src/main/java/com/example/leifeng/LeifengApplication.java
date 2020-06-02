package com.example.leifeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.leifeng.dao")
public class LeifengApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeifengApplication.class, args);
	}

}
