package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.WikipediaDto
import com.example.nobelandroidapp.domain.model.Wikipedia


fun WikipediaDto.toWikipedia(): Wikipedia {
    return Wikipedia(
        english = english
    )
}