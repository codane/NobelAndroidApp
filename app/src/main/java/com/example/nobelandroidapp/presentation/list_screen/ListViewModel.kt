package com.example.nobelandroidapp.presentation.list_screen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.nobelandroidapp.domain.model.Laureate
import com.example.nobelandroidapp.domain.use_case.GetLaureatesListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val getLaureatesListUseCase: GetLaureatesListUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _categoryAbbreviation: String = checkNotNull(savedStateHandle["category"])
    private val _selectedLaureate: MutableState<Laureate?> = mutableStateOf(null)
    val selectedLaureate: State<Laureate?> = _selectedLaureate


    fun selectLaureate(clickedLaureate: Laureate) {
        _selectedLaureate.value = clickedLaureate
    }

     val getLaureates : Flow<PagingData<Laureate>> =
         getLaureatesListUseCase(_categoryAbbreviation).cachedIn(viewModelScope)

}