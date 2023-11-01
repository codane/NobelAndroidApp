package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.NobelPrizeDto
import com.example.nobelandroidapp.domain.model.NobelPrize


fun NobelPrizeDto.toNobelPrize(): NobelPrize {
    return NobelPrize(
        awardYear = awardYear,
        category = category.toCategory(),
        motivation = motivation.toMotivation(),
        prizeAmount = prizeAmount,
        prizeAmountAdjusted = prizeAmountAdjusted
    )
}