package com.nithiann.usercomposepage.infrastructure.remote.dto

import com.nithiann.usercomposepage.domain.model.Coordinates

data class CoordinatesDTO(
    val lat: Double,
    val lng: Double
)

fun CoordinatesDTO.toCoordinates(): Coordinates {
    return Coordinates(
        lat = lat,
        lng = lng
    )
}