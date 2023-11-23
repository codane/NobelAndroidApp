package com.example.nobelandroidapp.presentation.list_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.nobelandroidapp.ui.theme.NobelGreen

@Composable
fun ListScreen(
    viewModel: ListViewModel,
    onNavigateToDetail: () -> Unit
) {
    val uiState = viewModel.uiState.value
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(NobelGreen)
    ) {
        when (uiState) {
            is ListUiState.LoadingState -> {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            is ListUiState.LoadSuccessState -> {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    content = {
                        items(uiState.laureates) { laureate ->
                            LaureateItem(
                                laureate = laureate,
                                onNavigateToDetail = { onNavigateToDetail() },
                                onLaureateSelected = { viewModel.selectLaureate(it) }
                            )
                        }
                    }
                )
            }

            is ListUiState.ErrorState -> {
                Text(
                    text = uiState.errorMessage,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}

