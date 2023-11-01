package com.example.nobelandroidapp.dto

data class PlaceDto(
    val city: CityDto,
    val cityNow: CityNowDto,
    val continent: ContinentDto,
    val country: CountryDto,
    val countryNow: CountryNowDto,
    val locationString: LocationStringDto
)