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

    private val _categories = mutableListOf<CategoryInfo>()
    val categories = _categories

    init {
        getCategoriesInfo()
    }

    private fun getCategoriesInfo() {
        getCategoriesUseCase().let { categories ->
            _categories.addAll(categories)
        }
    }
}