package com.example.nobelandroidapp.data.remote.dto

data class CityNowDto(
    val en: String = "",
    val latitude: String? = null,
    val longitude: String? = null,
    val no: String = "",
    val sameAs: List<String>? = null,
    val se: String = ""
)