package com.example.nobelandroidapp.domain.repository

import com.example.nobelandroidapp.domain.local.model.CategoryInfo

interface LocalRepository {

    fun getPrizeCategories() : List<CategoryInfo>
}