package com.ahmed.yassir.data.model

import com.squareup.moshi.Json

data class Info(
    @Json(name = "count") val count: Int,
    @Json(name = "pages") val pages: Int,
    @Json(name = "next") val next: String?,
    @Json(name = "prev") val prev: String?
)