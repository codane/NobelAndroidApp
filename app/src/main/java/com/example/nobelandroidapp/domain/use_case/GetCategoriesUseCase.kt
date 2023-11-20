package com.example.nobelandroidapp.domain.use_case

import com.example.nobelandroidapp.domain.local.model.CategoryInfo
import com.example.nobelandroidapp.domain.repository.LocalRepository
import javax.inject.Inject

class GetCategoriesUseCase @Inject constructor(
    private val localRepository: LocalRepository
) {

    operator fun invoke() : List<CategoryInfo> {
        return localRepository.getPrizeCategories()
    }
}