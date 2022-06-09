package com.nithiann.usercomposepage.infrastructure.repository

import javax.inject.Inject;
import com.nithiann.usercomposepage.domain.repository.UserRepository
import com.nithiann.usercomposepage.infrastructure.remote.UserGeneratorApi
import com.nithiann.usercomposepage.infrastructure.remote.dto.UserDTO

class UserRepositoryImpl @Inject constructor(
    private val api: UserGeneratorApi
): UserRepository {
    override suspend fun getUsers(): UserDTO {
        return api.getUsers();
    }
}