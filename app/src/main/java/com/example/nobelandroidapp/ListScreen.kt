package com.example.nobelandroidapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ListScreen() {

    val viewModel: ListViewModel = viewModel()

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        items(viewModel.state.value) { laureate ->
            LaureateItem(laureate = laureate)
        }
    }
}

