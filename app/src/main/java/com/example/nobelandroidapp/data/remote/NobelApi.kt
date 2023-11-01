package com.example.nobelandroidapp.data.remote

import com.example.nobelandroidapp.data.remote.dto.NobelResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface NobelApi {

    @GET("/2.1/laureates")
    suspend fun getLaureatesByCategory(
        @Query("offset") apiOffset: Int,
        @Query("limit") apiLimit: Int,
        @Query("nobelPrizeCategory") categoryAbbreviation: String
    ) : NobelResponseDto
}