package com.example.nobelandroidapp.data.remote.dto

data class NobelResponseDto(
    val laureates: List<LaureateDto>,
    val links: LinksDto,
    val meta: MetaDto
)