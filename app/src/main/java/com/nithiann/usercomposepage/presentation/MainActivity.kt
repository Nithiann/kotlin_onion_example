package com.nithiann.usercomposepage.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nithiann.usercomposepage.presentation.ui.theme.UserComposePageTheme
import com.nithiann.usercomposepage.presentation.userpage.UserScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserComposePageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController();
                    NavHost(
                        navController = navController,
                        startDestination = com.nithiann.usercomposepage.presentation.Screen.UserScreen.route
                    ) {
                        composable(route = com.nithiann.usercomposepage.presentation.Screen.UserScreen.route) {
                            UserScreen(navController)
                        }
                    }
                }
            }
        }
    }
}
