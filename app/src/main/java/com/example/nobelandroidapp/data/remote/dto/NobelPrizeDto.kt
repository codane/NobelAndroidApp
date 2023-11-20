package com.example.nobelandroidapp.data.remote.dto

data class NobelPrizeDto(
    val affiliations: List<AffiliationDto>? = listOf(),
    val awardYear: String = "",
    val category: CategoryDto = CategoryDto(),
    val categoryFullName: CategoryFullNameDto = CategoryFullNameDto(),
    val dateAwarded: String? = "",
    val links: List<LinkDto> = listOf(),
    val motivation: MotivationDto = MotivationDto(),
    val portion: String = "",
    val prizeAmount: Int = 0,
    val prizeAmountAdjusted: Int = 0,
    val prizeStatus: String = "",
    val residences: List<ResidenceDto>? = listOf(),
    val sortOrder: String = ""
)