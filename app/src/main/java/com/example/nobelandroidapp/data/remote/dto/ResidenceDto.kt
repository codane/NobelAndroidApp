package com.example.nobelandroidapp.data.remote.dto

data class ResidenceDto(
    val country: com.example.nobelandroidapp.data.remote.dto.CountryDto,
    val countryNow: com.example.nobelandroidapp.data.remote.dto.CountryNowDto,
    val locationString: com.example.nobelandroidapp.data.remote.dto.LocationStringDto
)