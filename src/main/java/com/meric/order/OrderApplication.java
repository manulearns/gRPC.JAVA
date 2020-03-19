package com.meric.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
		//Server server = ServerBuilder.forPort(8090).addService( new OrderSvc()).build();
	}	
	
	
	

}
