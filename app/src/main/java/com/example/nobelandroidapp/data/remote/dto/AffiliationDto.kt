package com.example.nobelandroidapp.data.remote.dto

data class AffiliationDto(
    val city: com.example.nobelandroidapp.data.remote.dto.CityDto,
    val cityNow: com.example.nobelandroidapp.data.remote.dto.CityNowDto,
    val country: com.example.nobelandroidapp.data.remote.dto.CountryDto,
    val countryNow: com.example.nobelandroidapp.data.remote.dto.CountryNowDto,
    val locationString: com.example.nobelandroidapp.data.remote.dto.LocationStringDto,
    val name: com.example.nobelandroidapp.data.remote.dto.NameDto,
    val nameNow: com.example.nobelandroidapp.data.remote.dto.NameNowDto
)