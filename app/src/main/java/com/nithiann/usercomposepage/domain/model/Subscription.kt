package com.nithiann.usercomposepage.domain.model

data class Subscription(
    val payment_method: String,
    val plan: String,
    val status: String,
    val term: String
)
