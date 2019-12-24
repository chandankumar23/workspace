package com.eservecloud.sprintbootdocker;


import org.lognet.springboot.grpc.GRpcService;

import com.eservecloud.proto.grpc.hello.generated.HelloRequest;
import com.eservecloud.proto.grpc.hello.generated.HelloResponse;
import com.eservecloud.proto.grpc.hello.generated.HelloServiceGrpc.HelloServiceImplBase;

import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GRpcService
public class GrpcHelloServiceImpl extends HelloServiceImplBase {

	Logger logger= LoggerFactory.getLogger(GrpcHelloServiceImpl.class);

	@Override
	public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
		logger.debug("Print debug logger from GRPC service");
		logger.info("Print info logger from GRPC service");
		responseObserver.onNext(HelloResponse.newBuilder().setGreeting("Hello people: "+request.getNewParam()).build());
		responseObserver.onCompleted();
	}


}
