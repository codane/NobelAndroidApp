package com.example.nobelandroidapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ListScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        for (laureate in mockLaureateList) {
            LaureateItem(laureate = laureate)
        }
    }
}
val mockLaureateList: List<Laureate> = listOf(
    Laureate("Laureate 1", 1904),
    Laureate("Laureate 2", 1987),
    Laureate("Laureate 3", 1976),
    Laureate("Laureate 4", 1954),
    Laureate("Laureate 5", 2002),
    Laureate("Laureate 6", 2004),
    Laureate("Laureate 7", 2012)
)