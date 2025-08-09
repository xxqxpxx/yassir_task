package com.ahmed.yassir.presentation.characterdetail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmed.yassir.domain.usecase.GetCharacterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterDetailViewModel @Inject constructor(
    private val getCharacterUseCase: GetCharacterUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = MutableStateFlow<CharacterDetailState>(CharacterDetailState.Loading)
    val state: StateFlow<CharacterDetailState> = _state

    init {
        savedStateHandle.get<String>("characterId")?.let {
            getCharacter(it.toInt())
        }
    }

    private fun getCharacter(id: Int) {
        viewModelScope.launch {
            try {
                val character = getCharacterUseCase(id)
                _state.value = CharacterDetailState.Success(character)
            } catch (e: Exception) {
                _state.value = CharacterDetailState.Error(e.message ?: "An error occurred")
            }
        }
    }
}