package com.nithiann.usercomposepage.presentation

sealed class Screen(val route: String) {
    object UserScreen: Screen("users")
}
