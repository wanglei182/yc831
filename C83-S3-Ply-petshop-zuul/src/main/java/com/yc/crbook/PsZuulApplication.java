package com.yc.crbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class PsZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsZuulApplication.class, args);
	}
}
