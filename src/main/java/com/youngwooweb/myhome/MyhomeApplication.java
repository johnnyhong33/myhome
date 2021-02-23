package com.youngwooweb.myhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//extends SpringBootServletInitializer{ 추가 및 아래의 Override도 추가)
@SpringBootApplication
public class MyhomeApplication { //extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MyhomeApplication.class, args);
	}
	//@Override
	//protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	//	return builder.sources(MyhomeApplication.class);
	//}


}
