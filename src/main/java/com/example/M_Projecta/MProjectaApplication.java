package com.example.M_Projecta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@EnableDiscoveryClient

@EnableZuulProxy
@EnableEurekaClient
//@Configuration
public class MProjectaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MProjectaApplication.class, args);
	}

}
