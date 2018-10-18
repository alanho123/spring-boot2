package com.example.vodconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class VodConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VodConfigServerApplication.class, args);
	}
}
