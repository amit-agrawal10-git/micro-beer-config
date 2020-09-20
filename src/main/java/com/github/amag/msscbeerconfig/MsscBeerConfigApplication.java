package com.github.amag.msscbeerconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsscBeerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBeerConfigApplication.class, args);
	}

}
