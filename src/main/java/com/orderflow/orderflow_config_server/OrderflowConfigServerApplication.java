package com.orderflow.orderflow_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class OrderflowConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderflowConfigServerApplication.class, args);
	}

}
