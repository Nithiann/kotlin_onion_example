package com.nithiann.usercomposepage.infrastructure.remote.dto

import com.nithiann.usercomposepage.domain.model.Subscription

data class SubscriptionDTO(
    val payment_method: String,
    val plan: String,
    val status: String,
    val term: String
)

fun SubscriptionDTO.toSubscription(): Subscription {
    return Subscription(
        payment_method = payment_method,
        plan = plan,
        status = status,
        term = term
    );
}