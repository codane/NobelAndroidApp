package com.example.nobelandroidapp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nobelandroidapp.dto.LaureateDto

@Composable
fun LaureateItem(
    laureate: LaureateDto
) {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Text(
            text = laureate.fullName.en,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 8.dp)
        )
        Text(
            text = laureate.gender,
            modifier = Modifier.padding(start = 8.dp)
        )
    }

}