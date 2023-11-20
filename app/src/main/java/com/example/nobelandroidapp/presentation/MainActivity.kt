package com.example.nobelandroidapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.nobelandroidapp.presentation.home_screen.HomeScreen
import com.example.nobelandroidapp.presentation.list_screen.ListScreen
import com.example.nobelandroidapp.ui.theme.NobelAndroidAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NobelAndroidAppTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "home_screen"
                ) {
                    composable(route = "home_screen") {
                        HomeScreen(navController = navController)
                    }
                    composable(
                        route = "list_screen/{category}",
                        arguments = listOf(
                            navArgument("category") {
                                type = NavType.StringType
                            })
                        ) {
                        ListScreen()
                    }
                }
            }
        }
    }
}