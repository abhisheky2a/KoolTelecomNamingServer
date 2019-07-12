package com.server.naming.telecom.kool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KoolTelecomNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KoolTelecomNamingServerApplication.class, args);
	}

}
