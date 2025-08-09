package com.ahmed.yassir.domain.usecase

import com.ahmed.yassir.data.model.Character
import com.ahmed.yassir.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val characterRepository: CharacterRepository
) {
    suspend operator fun invoke(id: Int): Character {
        return characterRepository.getCharacter(id)
    }
}