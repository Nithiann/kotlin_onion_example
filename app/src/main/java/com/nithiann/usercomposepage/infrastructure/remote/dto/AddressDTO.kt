package com.nithiann.usercomposepage.infrastructure.remote.dto

import com.nithiann.usercomposepage.domain.model.Address

data class AddressDTO(
    val city: String,
    val coordinates: CoordinatesDTO,
    val country: String,
    val state: String,
    val street_address: String,
    val street_name: String,
    val zip_code: String
)

fun AddressDTO.toAddress(): Address {
    return com.nithiann.usercomposepage.domain.model.Address(
        city = city,
        coordinates = coordinates.toCoordinates(),
        country = country,
        state = state,
        street_address = street_address,
        street_name = street_name,
        zip_code = zip_code
    )
}