package com.ahmed.yassir.domain.usecase

import com.ahmed.yassir.data.model.CharacterResponse
import com.ahmed.yassir.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val characterRepository: CharacterRepository
) {
    suspend operator fun invoke(page: Int, name: String?): CharacterResponse {
        return characterRepository.getCharacters(page, name)
    }
}