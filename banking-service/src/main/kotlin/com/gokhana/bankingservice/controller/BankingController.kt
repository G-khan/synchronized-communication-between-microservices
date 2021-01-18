package com.gokhana.bankingservice.controller

import com.gokhana.bankingservice.model.PayDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import com.gokhana.bankingservice.model.toResponse
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/api/v1/")
class BankingController {

    @PostMapping("banking")
    fun pay(@RequestBody payDTO: PayDTO): MutableMap<String, out Any> {
        print("Incoming payment: $payDTO")
        return toResponse(true)
    }

}