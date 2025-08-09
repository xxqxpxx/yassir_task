package com.ahmed.yassir.presentation.characterlist

import com.ahmed.yassir.data.model.Character

sealed interface CharacterListState {
    object Loading : CharacterListState
    data class Success(val characters: List<Character>) : CharacterListState
    data class Error(val message: String) : CharacterListState
}