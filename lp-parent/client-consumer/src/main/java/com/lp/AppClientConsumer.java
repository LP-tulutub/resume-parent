package com.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableEurekaClient
@EnableFeignClients
//@EnableHystrix
//@ServletComponentScan
public class AppClientConsumer {

	public static void main(String[] args) {
		SpringApplication.run(AppClientConsumer.class, args);
	}
}
