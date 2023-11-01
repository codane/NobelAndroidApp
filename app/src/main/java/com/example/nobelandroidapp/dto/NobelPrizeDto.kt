package com.example.nobelandroidapp.dto

data class NobelPrizeDto(
    val affiliations: List<AffiliationDto>,
    val awardYear: String,
    val category: CategoryDto,
    val categoryFullName: CategoryFullNameDto,
    val dateAwarded: String,
    val links: List<LinkDto>,
    val motivation: MotivationDto,
    val portion: String,
    val prizeAmount: Int,
    val prizeAmountAdjusted: Int,
    val prizeStatus: String,
    val residences: List<ResidenceDto>,
    val sortOrder: String
)