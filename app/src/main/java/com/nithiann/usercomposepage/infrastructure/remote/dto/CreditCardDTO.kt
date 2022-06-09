package com.nithiann.usercomposepage.infrastructure.remote.dto

import com.nithiann.usercomposepage.domain.model.CreditCard

data class CreditCardDTO(
    val cc_number: String
)

fun CreditCardDTO.toCreditCard(): CreditCard {
    return CreditCard(
        cc_number = cc_number
    )
}