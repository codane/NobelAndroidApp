package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.NobelResponseDto
import com.example.nobelandroidapp.domain.model.NobelResponse


fun NobelResponseDto.toNobelResponse(): NobelResponse {
    return NobelResponse(
        laureates = laureates.map { it.toLaureate() }
    )
}