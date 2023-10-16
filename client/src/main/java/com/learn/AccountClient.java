package com.learn;

import com.learn.learngrpc.proto.AccountServiceGrpc;
import com.learn.learngrpc.proto.AccountServiceGrpc.AccountServiceBlockingStub;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

@Component
public class AccountClient {
    @GrpcClient("local-grpc-server")
    private AccountServiceBlockingStub accountServiceStub;

    public com.learn.learngrpc.proto.Account getAccount(int id) {
        com.learn.learngrpc.proto.AccountRequest request = com.learn.learngrpc.proto.AccountRequest.newBuilder()
                .setId(id)
                .build();

        return accountServiceStub.getAccount(request);
    }

}
