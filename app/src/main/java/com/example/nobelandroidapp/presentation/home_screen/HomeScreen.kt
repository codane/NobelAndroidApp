package com.example.nobelandroidapp.presentation.home_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.nobelandroidapp.presentation.home_screen.components.CategoriesGrid
import com.example.nobelandroidapp.ui.theme.NobelGreen

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel(),
    onNavigateToListScreen : (String) -> Unit
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(NobelGreen)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Choose the category and start exploring the world of Nobel laureates",
                style = TextStyle(fontSize = 25.sp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            CategoriesGrid(
                categories = homeViewModel.categories,
                onNavigateToListScreen = { onNavigateToListScreen(it) },
            )
        }

    }
}