package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.MotivationDto
import com.example.nobelandroidapp.domain.model.Motivation


fun MotivationDto.toMotivation(): Motivation {
    return Motivation(
        en = en
    )
}