package com.nithiann.usercomposepage.domain.repository

import com.nithiann.usercomposepage.infrastructure.remote.dto.UserDTO

interface UserRepository {

    suspend fun getUsers(): UserDTO;
}