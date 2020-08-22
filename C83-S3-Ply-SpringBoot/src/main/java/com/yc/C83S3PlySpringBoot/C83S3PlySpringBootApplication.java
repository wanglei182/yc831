package com.yc.C83S3PlySpringBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.yc.C83S3PlySpringBoot.dao")
public class C83S3PlySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(C83S3PlySpringBootApplication.class, args);
	}

}
