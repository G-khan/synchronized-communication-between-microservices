package com.gokhana.paymentservice.service;

import com.gokhana.paymentservice.client.BankingClient;
import com.gokhana.paymentservice.controller.PaymentController;
import com.gokhana.paymentservice.model.PayRequest;
import com.gokhana.paymentservice.model.PaymentDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentServiceImpl  implements  PaymentService{

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentController.class);

    final BankingClient bankingClient;

    public PaymentServiceImpl(BankingClient bankingClient) {
        this.bankingClient = bankingClient;
    }

    @Override
    public PaymentDTO pay(PaymentDTO paymentDTO) {
        Map<String, Object> bankResponse = bankingClient.pay(new PayRequest(paymentDTO.getPaymentType(),paymentDTO.getBankId(),paymentDTO.getAmount().toString()));
        paymentDTO.setId((Integer) bankResponse.get("id"));
        LOGGER.info("Payment is done with :{}",bankResponse.toString());
        return paymentDTO;
    }
}
