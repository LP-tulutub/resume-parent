package com.lp;

import com.lp.rabbitmq.SecKillSendService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@ServletComponentScan
@EnableBinding(SecKillSendService.class)
public class SeckillClientConsumer {

	public static void main(String[] args) {
		SpringApplication.run(SeckillClientConsumer.class, args);
	}
}
