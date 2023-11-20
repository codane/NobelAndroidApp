package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.BirthDto
import com.example.nobelandroidapp.domain.model.Birth


fun BirthDto.toBirth(): Birth {
    return Birth(
        date = date,
        place = place?.toPlace()
    )
}