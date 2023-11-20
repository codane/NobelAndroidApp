package com.example.nobelandroidapp.presentation.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nobelandroidapp.domain.local.model.CategoryInfo
import com.example.nobelandroidapp.ui.theme.NobelGrey

@Composable
fun CategoryGridItem(
    category: CategoryInfo,
    modifier: Modifier = Modifier,
    navController: NavController
) {

    val cat = LocalContext.current.getString(category.categoryAbbreviation)
    BoxWithConstraints(
        modifier = modifier
            .padding(8.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(20.dp))
            .background(NobelGrey)
            .clickable { navController.navigate("list_screen/$cat") }
    ) {
        Column {
            Text(
                text = LocalContext.current.getString(category.categoryName),
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp),
            )
            Image(
                painter = painterResource(id = category.categoryIllustration),
                contentDescription = null
            )
        }
    }
}

