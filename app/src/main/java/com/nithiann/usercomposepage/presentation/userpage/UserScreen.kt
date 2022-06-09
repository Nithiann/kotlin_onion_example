package com.nithiann.usercomposepage.presentation.userpage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.nithiann.usercomposepage.presentation.userpage.components.UserCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserScreen(
    viewModel: UserPageViewModel = hiltViewModel(),
    color: Color = MaterialTheme.colorScheme.primaryContainer
) {
    val state = viewModel.state.value;
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Random person") },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
            )

        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            state.user?.let { user ->
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                ) {
                    item {
                        UserCard(user)
                    }
                }
            }
        }
    }


}