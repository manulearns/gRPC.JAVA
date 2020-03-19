# gRPC.JAVA in Windows

Understand the difference between HTTP/1.1 & HTTP/2 -> https://www.digitalocean.com/community/tutorials/http-1-1-vs-http-2-what-s-the-difference

Download and Install Protoc compiler from https://github.com/protocolbuffers/protobuf/releases/

Modify the pom file to change the input and output directories as required.

Use BloomRPC client

The code is for Unary Call using RPC. It creates an order.

message OrderRequest {
    string orderNo = 1;
    string orderDate = 2;
}

message OrderResponse {
    string orderDetails = 1;
}

service OrderService {
    rpc order(OrderRequest) returns (OrderResponse);
}
