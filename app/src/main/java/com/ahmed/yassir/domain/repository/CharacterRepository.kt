package com.ahmed.yassir.domain.repository

import com.ahmed.yassir.data.model.Character
import com.ahmed.yassir.data.model.CharacterResponse

interface CharacterRepository {
    suspend fun getCharacters(page: Int, name: String?): CharacterResponse
    suspend fun getCharacter(id: Int): Character
}