package com.example.nobelandroidapp.domain.repository

import com.example.nobelandroidapp.common.NetworkResult
import com.example.nobelandroidapp.domain.model.Laureate
import kotlinx.coroutines.flow.Flow

interface NobelRepository {

   suspend fun getLaureatesByCategory(
       apiOffset: Int,
       apiLimit: Int,
       categoryAbbreviation: String
   ) : Flow<NetworkResult<List<Laureate>>>
}