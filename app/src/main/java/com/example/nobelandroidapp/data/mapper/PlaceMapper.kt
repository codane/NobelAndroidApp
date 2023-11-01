package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.PlaceDto
import com.example.nobelandroidapp.domain.model.Place


fun PlaceDto.toPlace(): Place {
    return Place(
        country = country.toCountry()
    )
}