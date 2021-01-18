package com.gokhana.paymentservice.client;

import com.gokhana.paymentservice.model.PayRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient("banking-service")
public interface BankingClient {

    @PostMapping(value = "/api/v1/banking")
    Map<String,Object> pay(PayRequest payRequest);
}
