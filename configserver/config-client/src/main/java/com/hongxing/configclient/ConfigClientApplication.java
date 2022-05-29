package com.hongxing.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ConfigClientApplication {



	public static void main(String[] args) throws IOException {
		SpringApplication.run(ConfigClientApplication.class, args);

	}

}
