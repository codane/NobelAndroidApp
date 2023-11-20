package com.example.nobelandroidapp.data.remote.dto

data class LaureateDto(
    val birth: BirthDto = BirthDto(),
    val death: DeathDto? = DeathDto(),
    val familyName: FamilyNameDto = FamilyNameDto(),
    val fileName: String = "",
    val fullName: FullNameDto = FullNameDto(),
    val gender: String = "",
    val givenName: GivenNameDto = GivenNameDto(),
    val id: String = "",
    val knownName: KnownNameDto = KnownNameDto(),
    val links: List<LinkDto> = listOf(),
    val nobelPrizes: List<NobelPrizeDto> = listOf(),
    val sameAs: List<String> = listOf(),
    val wikidata: WikidataDto = WikidataDto(),
    val wikipedia: WikipediaDto = WikipediaDto()
)