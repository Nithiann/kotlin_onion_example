package com.nithiann.usercomposepage.presentation.userpage

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun UserScreen(
    navController: NavController,
    viewModel: UserPageViewModel = hiltViewModel()
) {
    val state = viewModel.state.value;
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        state.user?.let { user ->
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(
                            text = "${user.first_name} ",
                            style = MaterialTheme.typography.headlineMedium
                        )
                        Text(
                            text = "${user.last_name}",
                            style = MaterialTheme.typography.headlineMedium
                        )
                    }

                }
            }
        }
    }

}