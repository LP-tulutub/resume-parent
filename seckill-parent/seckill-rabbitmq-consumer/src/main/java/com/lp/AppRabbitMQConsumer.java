package com.lp;

import com.lp.receive.ReceiverService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ReceiverService.class)
@MapperScan("com.lp.mapper")
public class AppRabbitMQConsumer {

	public static void main(String[] args) {
		SpringApplication.run(AppRabbitMQConsumer.class, args);
	}
}
