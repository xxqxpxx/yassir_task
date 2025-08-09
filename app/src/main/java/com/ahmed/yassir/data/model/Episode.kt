package com.ahmed.yassir.data.model

import com.squareup.moshi.Json

data class Episode(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "air_date") val airDate: String,
    @Json(name = "episode") val episode: String,
    @Json(name = "characters") val characters: List<String> = emptyList(),
    @Json(name = "url") val url: String = "",
    @Json(name = "created") val created: String = ""
)
