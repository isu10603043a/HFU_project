package com.tainan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tainan")
public class HFU_Project {

	public static void main(String[] args) {
		SpringApplication.run(HFU_Project.class, args);
	}

}
