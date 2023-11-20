package com.example.nobelandroidapp.data.remote.dto

data class LaureateDto(
    val birth: BirthDto,
    val death: DeathDto,
    val familyName: FamilyNameDto,
    val fileName: String,
    val fullName: FullNameDto,
    val gender: String,
    val givenName: GivenNameDto,
    val id: String,
    val knownName: KnownNameDto,
    val links: List<LinkDto>,
    val nobelPrizes: List<NobelPrizeDto>,
    val sameAs: List<String>,
    val wikidata: WikidataDto,
    val wikipedia: WikipediaDto
)