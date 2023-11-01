package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.LaureateDto
import com.example.nobelandroidapp.domain.model.Laureate


fun LaureateDto.toLaureate(): Laureate {
    return Laureate(
        birth = birth.toBirth(),
        fullName = fullName.toFullName(),
        gender = gender,
        id = id,
        nobelPrizes = nobelPrizes.map { it.toNobelPrize() },
        wikipedia = wikipedia.toWikipedia()
    )
}