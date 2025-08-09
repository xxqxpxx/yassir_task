package com.ahmed.yassir.presentation.characterlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmed.yassir.domain.usecase.GetCharactersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterListViewModel @Inject constructor(
    private val getCharactersUseCase: GetCharactersUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<CharacterListState>(CharacterListState.Loading)
    val state: StateFlow<CharacterListState> = _state

    private var currentPage = 1
    private var isFetching = false

    init {
        getCharacters()
    }

    fun getCharacters(name: String? = null) {
        if (isFetching) return
        isFetching = true
        viewModelScope.launch {
            try {
                val response = getCharactersUseCase(currentPage, name)
                _state.value = CharacterListState.Success(response.results)
                currentPage++
            } catch (e: Exception) {
                _state.value = CharacterListState.Error(e.message ?: "An error occurred")
            }
            isFetching = false
        }
    }
}