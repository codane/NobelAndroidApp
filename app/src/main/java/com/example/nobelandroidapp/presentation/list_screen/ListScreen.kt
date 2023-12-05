package com.example.nobelandroidapp.presentation.list_screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems

@Composable
fun ListScreen(
    viewModel: ListViewModel,
    onNavigateToDetail: () -> Unit
) {
    val laureates = viewModel.getLaureates.collectAsLazyPagingItems()

    LazyColumn {
        if (laureates.loadState.append == LoadState.Loading) {
            item {
                CircularProgressIndicator(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                )
            }
        }

        items(count = laureates.itemCount) { index ->
            val laureate = laureates[index]
            LaureateItem(
                laureate = laureate!!,
                onNavigateToDetail = { onNavigateToDetail() },
                onLaureateSelected = { viewModel.selectLaureate(laureate) },
            )

        }
    }
}

