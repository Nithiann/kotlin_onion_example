package com.nithiann.usercomposepage.domain.use_case.getUsers

import com.nithiann.usercomposepage.common.Resource
import com.nithiann.usercomposepage.domain.model.User
import com.nithiann.usercomposepage.domain.repository.UserRepository
import com.nithiann.usercomposepage.infrastructure.remote.dto.toUser
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class getUsersUseCase @Inject constructor (
    private val repository: UserRepository
)   {
    // flow allows multiple inputs
    operator fun invoke(): Flow<Resource<User>> = flow {
        try {
            // start loading
            emit(Resource.Loading())
            val user = repository.getUsers().toUser()
            emit(Resource.Success(user))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An expected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error(e.localizedMessage ?: "Couldn't reach server. Please try again later."))
        }
    }
}