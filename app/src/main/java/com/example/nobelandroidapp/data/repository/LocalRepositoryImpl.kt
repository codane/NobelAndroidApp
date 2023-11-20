package com.example.nobelandroidapp.data.repository

import com.example.nobelandroidapp.data.local.NobelPrizeCategories
import com.example.nobelandroidapp.domain.local.model.CategoryInfo
import com.example.nobelandroidapp.domain.repository.LocalRepository
import javax.inject.Inject

class LocalRepositoryImpl @Inject constructor(
    private val categories: NobelPrizeCategories
) : LocalRepository {
    override fun getPrizeCategories(): List<CategoryInfo> {
        return categories.loadCategories()
    }
}