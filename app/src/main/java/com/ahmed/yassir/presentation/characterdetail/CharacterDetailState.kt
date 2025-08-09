package com.ahmed.yassir.presentation.characterdetail

import com.ahmed.yassir.data.model.Character

sealed interface CharacterDetailState {
    object Loading : CharacterDetailState
    data class Success(val character: Character) : CharacterDetailState
    data class Error(val message: String) : CharacterDetailState
}