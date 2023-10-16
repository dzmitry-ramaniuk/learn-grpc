package com.learn.service;

import com.learn.learngrpc.proto.Account;
import com.learn.learngrpc.proto.AccountRequest;
import com.learn.learngrpc.proto.AccountServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class AccountService extends AccountServiceGrpc.AccountServiceImplBase {
    @Override
    public void getAccount(AccountRequest request, StreamObserver<Account> responseObserver) {

        Account account = Account.newBuilder()
                .setId(request.getId())
                .setName("John")
                .setSurname("Doe")
                .build();

        responseObserver.onNext(account);
        responseObserver.onCompleted();
    }
}
