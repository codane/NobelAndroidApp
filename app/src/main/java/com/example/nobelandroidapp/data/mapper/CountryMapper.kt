package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.CountryDto
import com.example.nobelandroidapp.domain.model.Country


fun CountryDto.toCountry(): Country {
    return Country(
        en = en
    )
}