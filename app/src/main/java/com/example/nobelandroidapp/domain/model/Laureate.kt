package com.example.nobelandroidapp.domain.model

data class Laureate(
    val birth: Birth,
    val fullName: FullName,
    val gender: String,
    val id: String,
    val nobelPrizes: List<NobelPrize>,
    val wikipedia: Wikipedia
)
