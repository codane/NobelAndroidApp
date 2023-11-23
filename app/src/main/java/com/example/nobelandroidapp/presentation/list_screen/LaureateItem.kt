package com.example.nobelandroidapp.presentation.list_screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nobelandroidapp.domain.model.Laureate

@Composable
fun LaureateItem(
    laureate: Laureate,
    onNavigateToDetail: () -> Unit,
    onLaureateSelected: (Laureate) -> Unit
) {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                onLaureateSelected(laureate)
                onNavigateToDetail()
            },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Text(
            text = laureate.fullName.en,
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 8.dp),
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = laureate.gender,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 8.dp)
        )
    }

}