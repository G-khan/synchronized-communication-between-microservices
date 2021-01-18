package com.gokhana.paymentservice.controller;

import com.gokhana.paymentservice.model.PaymentDTO;
import com.gokhana.paymentservice.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentController.class);

    final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("payment")
    private ResponseEntity<PaymentDTO> payment(@RequestBody PaymentDTO paymentDTO){
        LOGGER.info("Incoming Request for payment:{}",paymentDTO.toString());
        PaymentDTO response = paymentService.pay(paymentDTO);
        return ResponseEntity.ok().body(response);
    }

}
