package com.example.nobelandroidapp.dto

data class AffiliationDto(
    val city: CityDto,
    val cityNow: CityNowDto,
    val country: CountryDto,
    val countryNow: CountryNowDto,
    val locationString: LocationStringDto,
    val name: NameDto,
    val nameNow: NameNowDto
)