package com.ahmed.yassir.data.model

import com.squareup.moshi.Json

data class Location(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "type") val type: String,
    @Json(name = "dimension") val dimension: String,
    @Json(name = "residents") val residents: List<String> = emptyList(),
    @Json(name = "url") val url: String = "",
    @Json(name = "created") val created: String = ""
)

