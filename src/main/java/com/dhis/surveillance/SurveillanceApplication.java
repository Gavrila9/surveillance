package com.dhis.surveillance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.dhis.surveillance.dao")
@ComponentScan(basePackages = "com.dhis.surveillance")
public class SurveillanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveillanceApplication.class, args);
	}

}
