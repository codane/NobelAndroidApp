package com.example.nobelandroidapp.data.remote.dto

data class NobelResponseDto(
    val laureates: List<LaureateDto> = listOf(),
    val links: LinksDto = LinksDto(),
    val meta: MetaDto = MetaDto()
)