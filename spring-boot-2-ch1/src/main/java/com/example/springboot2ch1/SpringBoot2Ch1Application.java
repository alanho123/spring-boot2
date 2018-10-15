package com.example.springboot2ch1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringBoot2Ch1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2Ch1Application.class, args);
	}
}

@Configuration
class VodConfiguration {

    @Bean
    public VodSetting getVodSetting() {
        return new VodSetting();
    }
}
