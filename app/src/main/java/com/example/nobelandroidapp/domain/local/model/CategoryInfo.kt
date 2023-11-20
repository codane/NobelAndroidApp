package com.example.nobelandroidapp.domain.local.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CategoryInfo(
    @StringRes val categoryName: Int,
    @StringRes val categoryAbbreviation: Int,
    @DrawableRes val categoryIllustration: Int
)