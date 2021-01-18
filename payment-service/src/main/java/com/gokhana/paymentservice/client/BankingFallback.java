package com.gokhana.paymentservice.client;

import com.gokhana.paymentservice.model.PayRequest;

import java.util.Map;

public class BankingFallback implements BankingClient {

    @Override
    public Map<String, Object> pay(PayRequest payRequest) {
        // callback for fail scenario
        throw new RuntimeException("There is an Exception while payment!");
    }
}
