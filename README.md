# gRPC.JAVA in Windows

This code implements the gRPC Server

Understand the difference between HTTP/1.1 & HTTP/2 -> https://www.digitalocean.com/community/tutorials/http-1-1-vs-http-2-what-s-the-difference

 gRPC uses protocol buffers as the Interface Definition Language (IDL) for describing both the service interface and the structure of the payload messages. 
 Protocol buffers are a language-neutral, platform-neutral extensible mechanism for serializing structured data.
 
 Read the concepts in https://www.grpc.io/docs/guides/concepts/

Download and Install Protoc compiler from https://github.com/protocolbuffers/protobuf/releases/

Modify the pom file to change the *input* and *output* directories as required.

Use BloomRPC client

The code is for **Unary Call** using RPC. It creates an order.
```
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
```
