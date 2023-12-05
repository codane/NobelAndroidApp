package com.example.nobelandroidapp.domain.repository

import androidx.paging.PagingData
import com.example.nobelandroidapp.domain.model.Laureate
import kotlinx.coroutines.flow.Flow

interface NobelRepository {

    fun getLaureatesByCategory(
       categoryAbbreviation: String
   ) : Flow<PagingData<Laureate>>
}