package com.example.nobelandroidapp.data.remote.dto

data class ResidenceDto(
    val continent: ContinentDto = ContinentDto(),
    val country: CountryDto = CountryDto(),
    val countryNow: CountryNowDto = CountryNowDto(),
    val locationString: LocationStringDto = LocationStringDto()
)