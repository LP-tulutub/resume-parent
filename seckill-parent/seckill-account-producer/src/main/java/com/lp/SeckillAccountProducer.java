package com.lp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lp.mapper") //@MapperScan 用户扫描MyBatis的Mapper接口
public class SeckillAccountProducer {

	public static void main(String[] args) {
		SpringApplication.run(SeckillAccountProducer.class, args);
	}
}
