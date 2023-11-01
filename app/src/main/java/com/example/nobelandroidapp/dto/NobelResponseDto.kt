package com.example.nobelandroidapp.dto

data class NobelResponseDto(
    val laureates: List<LaureateDto>,
    val links: LinksDto,
    val meta: MetaDto
)