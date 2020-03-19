package com.meric.order.server;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;

import com.meric.order.service.OrderSvc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@Configuration
public class GRPCServer {

	public GRPCServer() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
		Server server = ServerBuilder.forPort(8090).addService( new OrderSvc()).build();
		server.start();
		System.out.println("Server started");
		server.awaitTermination();
		
	}

	
}
