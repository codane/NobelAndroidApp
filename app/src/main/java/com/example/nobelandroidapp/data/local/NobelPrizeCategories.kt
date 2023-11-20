package com.example.nobelandroidapp.data.local

import com.example.nobelandroidapp.R
import com.example.nobelandroidapp.domain.local.model.CategoryInfo

class NobelPrizeCategories {
    fun loadCategories(): List<CategoryInfo> {
        return listOf(
            CategoryInfo(
                categoryName = R.string.physics,
                categoryAbbreviation = R.string.physics_abbreviation,
                categoryIllustration = R.drawable.physics
            ),
            CategoryInfo(
                categoryName = R.string.chemistry,
                categoryAbbreviation = R.string.chemistry_abbreviation,
                categoryIllustration = R.drawable.chemistry
            ),
            CategoryInfo(
                categoryName = R.string.medicine,
                categoryAbbreviation = R.string.medicine_abbreviation,
                categoryIllustration = R.drawable.medicine
            ),
            CategoryInfo(
                categoryName = R.string.literature,
                categoryAbbreviation = R.string.literature_abbreviation,
                categoryIllustration = R.drawable.literature
            ),
            CategoryInfo(
                categoryName = R.string.peace,
                categoryAbbreviation = R.string.peace_abbreviation,
                categoryIllustration = R.drawable.peace
            ),
            CategoryInfo(
                categoryName = R.string.economic_sciences,
                categoryAbbreviation = R.string.economic_sciences_abbreviation,
                categoryIllustration = R.drawable.economy
            )
        )
    }
}