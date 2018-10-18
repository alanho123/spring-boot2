package com.example.vodconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VodConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VodConfigClientApplication.class, args);
	}
}


@RestController
@RefreshScope
class VodConfigController {

    @Autowired
    private VodConfig vodConfig;

	@GetMapping("/vod/config")
	public VodConfig config() {
		return vodConfig;
	}
}

@Configuration
class VodClientConfiguration {

    @Bean
    public VodConfig vodConfig() {
        return new VodConfig();
    }
}




