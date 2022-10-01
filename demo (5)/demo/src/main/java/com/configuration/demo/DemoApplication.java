package com.configuration.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping
public class DemoApplication {
 @Value("${spring.application.name}")
 private String str;

 @Value("${greeting:default_value}")
  private String str2;

 @Value("${spring.list.values}")
  private List<String> str3;

 @Autowired
 DbSetting dbSetting;
 @GetMapping("/")
 public String getStr() {

     return dbSetting.toString();
 }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
