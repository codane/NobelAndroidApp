package com.example.nobelandroidapp.data.remote.dto

data class AffiliationDto(
    val city: CityDto = CityDto(),
    val cityNow: CityNowDto = CityNowDto(),
    val continent: ContinentDto = ContinentDto(),
    val country: CountryDto = CountryDto(),
    val countryNow: CountryNowDto = CountryNowDto(),
    val locationString: LocationStringDto = LocationStringDto(),
    val name: NameDto = NameDto(),
    val nameNow: NameNowDto = NameNowDto()
)