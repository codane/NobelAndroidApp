package com.example.nobelandroidapp.presentation

import com.example.nobelandroidapp.domain.model.Laureate

sealed class ListUiState {
    object LoadingState : ListUiState()
    class LoadSuccessState(val laureates : List<Laureate>) : ListUiState()
    class ErrorState(val errorMessage : String) : ListUiState()
}
