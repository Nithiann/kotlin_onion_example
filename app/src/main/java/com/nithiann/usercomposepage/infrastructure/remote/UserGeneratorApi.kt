package com.nithiann.usercomposepage.infrastructure.remote

import com.nithiann.usercomposepage.infrastructure.remote.dto.UserDTO
import retrofit2.http.GET

interface UserGeneratorApi {
    @GET("users/random_user")
    suspend fun getUsers(): UserDTO;
}