package com.example.nobelandroidapp.data.remote.dto

data class LinkDto(
    val action: String = "",
    val `class`: List<String>? = null,
    val href: String = "",
    val rel: String = "",
    val title: String? = null,
    val types: String = ""
)