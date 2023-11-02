package com.example.nobelandroidapp.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nobelandroidapp.common.NetworkResult
import com.example.nobelandroidapp.domain.use_case.GetLaureatesListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val getLaureatesListUseCase: GetLaureatesListUseCase
) : ViewModel() {

    private val _uiState = mutableStateOf<ListUiState>(ListUiState.LoadingState)
    val uiState = _uiState

    init {
        getLaureatesByCategory()
    }

    private fun getLaureatesByCategory() {
        viewModelScope.launch {
            getLaureatesListUseCase(0,20, "eco")
                .collectLatest {result ->
                    when(result) {
                        is NetworkResult.Loading -> {
                            _uiState.value = ListUiState.LoadingState
                        }
                        is NetworkResult.Success -> {
                            _uiState.value = ListUiState.LoadSuccessState(result.data ?: emptyList())
                        }
                        is NetworkResult.Error -> {
                            result.errorMessage?.let {message ->
                                _uiState.value = ListUiState.ErrorState(errorMessage = message)

                            }
                        }
                    }
                }
        }
    }
}