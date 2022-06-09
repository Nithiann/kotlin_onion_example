package com.nithiann.usercomposepage.presentation.userpage

import com.nithiann.usercomposepage.domain.model.User

data class UserState (
    val isLoading: Boolean = false,
    val user: User? = null,
    val error: String = ""
)