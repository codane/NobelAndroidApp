package com.example.nobelandroidapp.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nobelandroidapp.data.remote.NobelApi
import com.example.nobelandroidapp.data.repository.NobelRepositoryImpl
import com.example.nobelandroidapp.domain.model.Laureate
import com.example.nobelandroidapp.domain.use_case.GetLaureatesListUseCase
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ListViewModel : ViewModel() {

    val state = mutableStateOf(emptyList<Laureate>())

    init {
        getLaureatesByCategory()
    }

    private fun getLaureatesByCategory() {
        viewModelScope.launch {
            val api: NobelApi = Retrofit.Builder()
                .baseUrl("https://api.nobelprize.org")
                .addConverterFactory(
                    GsonConverterFactory.create())
                .build()
                .create(NobelApi::class.java)
            val repo = NobelRepositoryImpl(api)
            val useCase = GetLaureatesListUseCase(repo)
            useCase(0,20, "che")
                .collectLatest {laureates ->
                    state.value = laureates
                }
        }
    }
}