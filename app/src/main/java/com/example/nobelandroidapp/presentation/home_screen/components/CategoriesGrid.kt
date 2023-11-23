package com.example.nobelandroidapp.presentation.home_screen.components

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.nobelandroidapp.domain.local.model.CategoryInfo

@Composable
fun CategoriesGrid(
    categories: List<CategoryInfo>,
    modifier: Modifier = Modifier,
    onNavigateToListScreen : (String) -> Unit
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2),
        content = {
            items(categories) { category ->
                CategoryGridItem(
                    category = category,
                    onNavigateToListScreen = { onNavigateToListScreen(it) }
                    )
            }
        })
}