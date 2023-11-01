package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.CategoryDto
import com.example.nobelandroidapp.domain.model.Category


fun CategoryDto.toCategory(): Category {
    return Category(
        en = en
    )
}