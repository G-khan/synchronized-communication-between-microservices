package com.gokhana.bankingservice.model

import kotlin.random.Random

data class PayDTO(val paymentType: String,
                  val bankId: String,
                  val payDetail: String)

fun toResponse(success: Boolean) = mutableMapOf("success" to success, "id" to Random.nextInt(0, 100))