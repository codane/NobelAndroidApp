package com.example.nobelandroidapp.data.repository

import com.example.nobelandroidapp.data.mapper.toNobelResponse
import com.example.nobelandroidapp.data.remote.NobelApi
import com.example.nobelandroidapp.domain.model.Laureate
import com.example.nobelandroidapp.domain.repository.NobelRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NobelRepositoryImpl @Inject constructor(
    private val api: NobelApi
) : NobelRepository {

    override suspend fun getLaureatesByCategory(
        apiOffset: Int,
        apiLimit: Int,
        categoryAbbreviation: String
    ): Flow<List<Laureate>> = flow {
        emit(api.getLaureatesByCategory(apiOffset, apiLimit, categoryAbbreviation).toNobelResponse().laureates)
    }
}