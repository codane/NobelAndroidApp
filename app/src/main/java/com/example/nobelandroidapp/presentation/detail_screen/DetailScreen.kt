package com.example.nobelandroidapp.presentation.detail_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nobelandroidapp.presentation.list_screen.ListViewModel
import com.example.nobelandroidapp.ui.theme.NobelGreen
import com.example.nobelandroidapp.ui.theme.NobelGrey

@Composable
fun DetailScreen(
    viewModel: ListViewModel
) {
    val selectedLaureate = viewModel.selectedLaureate.value
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(NobelGreen)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(PaddingValues(16.dp))
        ) {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .background(NobelGrey)
            ) {
                Text(text = "${selectedLaureate?.fullName?.en}")
            }

            Box(
                modifier = Modifier
                    .height(40.dp)
                    .background(NobelGrey)
            ) {
                Text(text = "Second box")
            }
        }
    }

}