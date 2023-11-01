package com.example.nobelandroidapp.domain.use_case

import android.util.Log
import com.example.nobelandroidapp.domain.model.Laureate
import com.example.nobelandroidapp.domain.repository.NobelRepository
import kotlinx.coroutines.flow.Flow

class GetLaureatesListUseCase(
    private val nobelRepository: NobelRepository
) {

    suspend operator fun invoke(
        apiOffset: Int,
        apiLimit: Int,
        category: String
    ) : Flow<List<Laureate>> {
        Log.d("Laureates use case", "Use case flow")
        return nobelRepository.getLaureatesByCategory(apiOffset, apiLimit, category)
    }
}