package com.example.nobelandroidapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nobelandroidapp.dto.LaureateDto
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ListViewModel : ViewModel() {

    val state = mutableStateOf(emptyList<LaureateDto>())

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
            val repo = NobelRepository(api)
            val list = repo.getLaureatesByCategory()
                state.value = list
        }
    }
}