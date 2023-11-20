package com.example.nobelandroidapp.data.repository

import com.example.nobelandroidapp.common.NetworkResult
import com.example.nobelandroidapp.data.mapper.toNobelResponse
import com.example.nobelandroidapp.data.remote.NobelApi
import com.example.nobelandroidapp.domain.model.Laureate
import com.example.nobelandroidapp.domain.repository.NobelRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class NobelRepositoryImpl @Inject constructor(
    private val api: NobelApi
) : NobelRepository {

    override suspend fun getLaureatesByCategory(
        apiOffset: Int,
        apiLimit: Int,
        categoryAbbreviation: String
    ): Flow<NetworkResult<List<Laureate>>> = flow {
        try {
            emit(NetworkResult.Loading())
            val response = api.getLaureatesByCategory(
                apiOffset,
                apiLimit,
                categoryAbbreviation
            ).toNobelResponse()
            val laureates = response.laureates
            emit(NetworkResult.Success(laureates))
        } catch (e: HttpException) {
            e.printStackTrace()
            emit(NetworkResult.Error(e.message()))
        } catch (e: IOException) {
            emit(NetworkResult.Error("Cannot reach server"))
        }
    }
}