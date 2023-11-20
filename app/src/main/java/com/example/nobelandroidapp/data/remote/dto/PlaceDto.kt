package com.example.nobelandroidapp.data.remote.dto

data class PlaceDto(
    val city: CityDto,
    val cityNow: CityNowDto,
    val continent: ContinentDto,
    val country: CountryDto,
    val countryNow: CountryNowDto,
    val locationString: LocationStringDto
)