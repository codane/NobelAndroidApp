package com.example.nobelandroidapp.dto

data class LinkDto(
    val action: String,
    val `class`: List<String>,
    val href: String,
    val rel: String,
    val title: String,
    val types: String
)