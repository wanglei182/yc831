package com.yc.petshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableEurekaClient
// 服务降级注解
@EnableCircuitBreaker
@SpringBootApplication
@EnableFeignClients
public class PsIndexApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(PsIndexApplication.class, args);
	}
	
	/**
	 * 	定义 RestTemplate  Bean
	 */
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		System.out.println("============================");
//		registry.addInterceptor(new LoginInterceptor()).addPathPatterns(
//				"/cart.html",
//				"/tocart",
//				"/user_home.html",
//				"/user_profile.html",
//				"/user_edit.html",
//				"/user_order.html");
//	}
	
	
	

}
