package com.example.nobelandroidapp.data.remote.dto

data class PlaceDto(
    val city: com.example.nobelandroidapp.data.remote.dto.CityDto,
    val cityNow: com.example.nobelandroidapp.data.remote.dto.CityNowDto,
    val continent: com.example.nobelandroidapp.data.remote.dto.ContinentDto,
    val country: com.example.nobelandroidapp.data.remote.dto.CountryDto,
    val countryNow: com.example.nobelandroidapp.data.remote.dto.CountryNowDto,
    val locationString: com.example.nobelandroidapp.data.remote.dto.LocationStringDto
)