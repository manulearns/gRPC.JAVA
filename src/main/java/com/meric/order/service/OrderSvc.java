package com.meric.order.service;

import com.meric.order.model.CreateOrderServiceGrpc.CreateOrderServiceImplBase;
import com.meric.order.model.OrderRequest;
import com.meric.order.model.OrderResponse;

import io.grpc.stub.StreamObserver;

public class OrderSvc extends CreateOrderServiceImplBase {

	@Override
	public void order(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
		// TODO Auto-generated method stub
		//super.order(request, responseObserver);
		
		System.out.println("Inside Order ..");
		String orderNo = request.getOrderNo();
		String orderDate = request.getOrderDate();
		
		System.out.println("Details of order in : orderNo" + orderNo + " orderDate :"+ orderDate);
		
		//use database to insert
		
		OrderResponse.Builder resp = OrderResponse.newBuilder();
		resp.setOrderDetails("Created order with orderNo: " + orderNo + " and Date :"+ orderDate);
		
		responseObserver.onNext(resp.build());
		responseObserver.onCompleted();
	}

}
