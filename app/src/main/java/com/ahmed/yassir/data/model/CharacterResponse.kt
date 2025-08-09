package com.ahmed.yassir.data.model

import com.squareup.moshi.Json

data class CharacterResponse(
    @Json(name = "info") val info: Info,
    @Json(name = "results") val results: List<Character>
)