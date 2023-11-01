package com.example.nobelandroidapp.data.remote.dto

data class LaureateDto(
    val birth: com.example.nobelandroidapp.data.remote.dto.BirthDto,
    val death: com.example.nobelandroidapp.data.remote.dto.DeathDto,
    val familyName: com.example.nobelandroidapp.data.remote.dto.FamilyNameDto,
    val fileName: String,
    val fullName: com.example.nobelandroidapp.data.remote.dto.FullNameDto,
    val gender: String,
    val givenName: com.example.nobelandroidapp.data.remote.dto.GivenNameDto,
    val id: String,
    val knownName: com.example.nobelandroidapp.data.remote.dto.KnownNameDto,
    val links: List<com.example.nobelandroidapp.data.remote.dto.LinkDto>,
    val nobelPrizes: List<com.example.nobelandroidapp.data.remote.dto.NobelPrizeDto>,
    val sameAs: List<String>,
    val wikidata: com.example.nobelandroidapp.data.remote.dto.WikidataDto,
    val wikipedia: com.example.nobelandroidapp.data.remote.dto.WikipediaDto
)