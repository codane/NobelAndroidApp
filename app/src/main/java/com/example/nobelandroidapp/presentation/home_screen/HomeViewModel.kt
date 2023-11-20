package com.example.nobelandroidapp.presentation.home_screen

import androidx.lifecycle.ViewModel
import com.example.nobelandroidapp.domain.local.model.CategoryInfo
import com.example.nobelandroidapp.domain.use_case.GetCategoriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getCategoriesUseCase: GetCategoriesUseCase
) : ViewModel() {

    private val _categoriesInfo = mutableListOf<CategoryInfo>()
    val categoriesInfo = _categoriesInfo

    init {
        getCategoriesInfo()
    }

    private fun getCategoriesInfo() {
        getCategoriesUseCase().let { categories ->
            _categoriesInfo.addAll(categories)
        }
    }
}