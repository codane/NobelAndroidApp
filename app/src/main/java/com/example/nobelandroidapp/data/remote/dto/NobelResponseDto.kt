package com.example.nobelandroidapp.data.remote.dto

data class NobelResponseDto(
    val laureates: List<com.example.nobelandroidapp.data.remote.dto.LaureateDto>,
    val links: com.example.nobelandroidapp.data.remote.dto.LinksDto,
    val meta: com.example.nobelandroidapp.data.remote.dto.MetaDto
)