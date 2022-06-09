package com.nithiann.usercomposepage.infrastructure.remote.dto

import com.nithiann.usercomposepage.domain.model.Employment

data class EmploymentDTO(
    val key_skill: String,
    val title: String
)

fun EmploymentDTO.toEmployment(): Employment {
    return Employment(
        key_skill = key_skill,
        title = title
    )
}