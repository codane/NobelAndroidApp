package com.example.nobelandroidapp.data.remote.dto

data class PlaceDto(
    val city: CityDto = CityDto(),
    val cityNow: CityNowDto = CityNowDto(),
    val continent: ContinentDto = ContinentDto(),
    val country: CountryDto = CountryDto(),
    val countryNow: CountryNowDto = CountryNowDto(),
    val locationString: LocationStringDto = LocationStringDto()
)