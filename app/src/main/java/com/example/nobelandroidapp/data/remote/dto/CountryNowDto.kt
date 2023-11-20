package com.example.nobelandroidapp.data.remote.dto

data class CountryNowDto(
    val en: String = "",
    val latitude: String = "",
    val longitude: String = "",
    val no: String = "",
    val sameAs: List<String> = listOf(),
    val se: String = ""
)