package com.nithiann.usercomposepage.presentation.userpage

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nithiann.usercomposepage.common.Resource
import com.nithiann.usercomposepage.domain.use_case.getUsers.getUsersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class UserPageViewModel @Inject constructor(
    private val getUsersUseCase: getUsersUseCase
): ViewModel() {
    private val _state = mutableStateOf(UserState())
    val state: State<UserState> = _state;

    init {
        getUsers()
    }

    private fun getUsers() {
        getUsersUseCase().onEach {result ->
            when(result) {
                is Resource.Success -> {
                    _state.value = UserState(user = result.data?: null)
                }
                is Resource.Error -> {
                    _state.value = UserState(error = result.message ?: "An error has occured")
                }
                is Resource.Loading -> {
                    _state.value = UserState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)

    }

}