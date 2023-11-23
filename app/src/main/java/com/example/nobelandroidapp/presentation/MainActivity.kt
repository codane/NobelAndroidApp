package com.example.nobelandroidapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.nobelandroidapp.presentation.detail_screen.DetailScreen
import com.example.nobelandroidapp.presentation.home_screen.HomeScreen
import com.example.nobelandroidapp.presentation.list_screen.ListScreen
import com.example.nobelandroidapp.presentation.list_screen.ListViewModel
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
                        HomeScreen(onNavigateToListScreen = { selectedCategory ->
                            navController.navigate(route = "list_screen/$selectedCategory")
                        })
                    }
                    navigation(startDestination = "list_screen", route = "Laureate") {
                        composable(
                            route = "list_screen/{category}",
                            arguments = listOf(
                                navArgument("category") {
                                    type = NavType.StringType
                                })
                        ) { backStackEntry ->
                            val entry = remember(backStackEntry) {
                                navController.getBackStackEntry("Laureate")
                            }
                            val viewModel = hiltViewModel<ListViewModel>(entry)
                            ListScreen(
                                viewModel = viewModel,
                                onNavigateToDetail = { navController.navigate(route = "detail_screen") },
                            )
                        }
                        composable(route = "detail_screen") { backStackEntry ->
                            val entry = remember(backStackEntry) {
                                navController.getBackStackEntry("Laureate")
                            }
                            val viewModel = hiltViewModel<ListViewModel>(entry)
                            DetailScreen(viewModel)
                        }
                    }
                }
            }
        }
    }
}