package com.study.springcloud.cipher;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@RestController
public class Application {
	
	@RequestMapping("/hello")
    public String home() {
		
        return "Hello World!";
    }
	
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
	}

}
