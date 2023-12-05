package com.example.nobelandroidapp.domain.use_case

import androidx.paging.PagingData
import com.example.nobelandroidapp.domain.model.Laureate
import com.example.nobelandroidapp.domain.repository.NobelRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetLaureatesListUseCase @Inject constructor(
    private val nobelRepository: NobelRepository
) {
     operator fun invoke(
        category: String
    ): Flow<PagingData<Laureate>> {
        return nobelRepository.getLaureatesByCategory(category)
    }
}