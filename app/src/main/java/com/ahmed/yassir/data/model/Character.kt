package com.ahmed.yassir.data.model

import com.squareup.moshi.Json

data class CharacterLocation(
    @Json(name = "name") val name: String,
    @Json(name = "url") val url: String
)

data class Character(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "status") val status: String,
    @Json(name = "species") val species: String,
    @Json(name = "type") val type: String = "",
    @Json(name = "gender") val gender: String,
    @Json(name = "origin") val origin: CharacterLocation,
    @Json(name = "location") val location: CharacterLocation,
    @Json(name = "image") val image: String,
    @Json(name = "episode") val episode: List<String> = emptyList(),
    @Json(name = "url") val url: String = "",
    @Json(name = "created") val created: String = ""
)
