package com.example.nobelandroidapp

import com.example.nobelandroidapp.dto.LaureateDto

class NobelRepository(
    private val api: NobelApi
) {

    suspend fun getLaureatesByCategory() : List<LaureateDto> {
       return api.getLaureatesByCategory(0, 20, "phy").laureates
    }
}