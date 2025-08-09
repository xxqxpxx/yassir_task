package com.ahmed.yassir.data.repository

import com.ahmed.yassir.data.model.Character
import com.ahmed.yassir.data.model.CharacterResponse
import com.ahmed.yassir.data.remote.ApiService
import com.ahmed.yassir.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : CharacterRepository {

    override suspend fun getCharacters(page: Int, name: String?): CharacterResponse {
        return apiService.getCharacters(page, name)
    }

    override suspend fun getCharacter(id: Int): Character {
        return apiService.getCharacter(id)
    }
}