package com.nithiann.usercomposepage.infrastructure.remote.dto

import com.nithiann.usercomposepage.domain.model.User

data class UserDTO(
    val address: AddressDTO,
    val avatar: String,
    val credit_card: CreditCardDTO,
    val date_of_birth: String,
    val email: String,
    val employment: EmploymentDTO,
    val first_name: String,
    val gender: String,
    val id: Int,
    val last_name: String,
    val password: String,
    val phone_number: String,
    val social_insurance_number: String,
    val subscription: SubscriptionDTO,
    val uid: String,
    val username: String
)

fun UserDTO.toUser(): User {
    return User(
        address = address.toAddress(),
        avatar = avatar,
        credit_card = credit_card.toCreditCard(),
        date_of_birth = date_of_birth,
        email = email,
        employment = employment.toEmployment(),
        first_name = first_name,
        gender = gender,
        id = id,
        last_name = last_name,
        password = password,
        phone_number = phone_number,
        social_insurance_number = social_insurance_number,
        subscription = subscription.toSubscription(),
        uid = uid,
        username = username
    );
}