package com.example.nobelandroidapp.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nobelandroidapp.data.remote.NobelApi
import com.example.nobelandroidapp.data.repository.NobelRepositoryImpl
import com.example.nobelandroidapp.domain.model.Laureate
import com.example.nobelandroidapp.domain.use_case.GetLaureatesListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val getLaureatesListUseCase: GetLaureatesListUseCase
) : ViewModel() {

    val state = mutableStateOf(emptyList<Laureate>())

    init {
        getLaureatesByCategory()
    }

    private fun getLaureatesByCategory() {
        viewModelScope.launch {
            getLaureatesListUseCase(0,20, "eco")
                .collectLatest {laureates ->
                    state.value = laureates
                }
        }
    }
}