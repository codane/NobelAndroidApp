package com.example.nobelandroidapp.domain.model

data class NobelPrize(
    val awardYear: String,
    val category: Category,
    val motivation: Motivation,
    val prizeAmount: Int,
    val prizeAmountAdjusted: Int
)
