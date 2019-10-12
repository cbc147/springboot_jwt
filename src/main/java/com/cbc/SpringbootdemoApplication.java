package com.cbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描mybatis mapper的包
@MapperScan(basePackages = "com.cbc.mapper")
//扫描所需要的包，包括自用的工具类包 所在的路径
@ComponentScan(basePackages = "com.cbc")

public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
