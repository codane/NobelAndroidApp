package com.example.nobelandroidapp.data.remote.dto

data class NobelPrizeDto(
    val affiliations: List<com.example.nobelandroidapp.data.remote.dto.AffiliationDto>,
    val awardYear: String,
    val category: com.example.nobelandroidapp.data.remote.dto.CategoryDto,
    val categoryFullName: com.example.nobelandroidapp.data.remote.dto.CategoryFullNameDto,
    val dateAwarded: String,
    val links: List<com.example.nobelandroidapp.data.remote.dto.LinkDto>,
    val motivation: com.example.nobelandroidapp.data.remote.dto.MotivationDto,
    val portion: String,
    val prizeAmount: Int,
    val prizeAmountAdjusted: Int,
    val prizeStatus: String,
    val residences: List<com.example.nobelandroidapp.data.remote.dto.ResidenceDto>,
    val sortOrder: String
)