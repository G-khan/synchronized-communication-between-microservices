package com.gokhana.paymentservice.service;

import com.gokhana.paymentservice.model.PaymentDTO;

public interface PaymentService {

    PaymentDTO pay(PaymentDTO paymentDTO);
}
