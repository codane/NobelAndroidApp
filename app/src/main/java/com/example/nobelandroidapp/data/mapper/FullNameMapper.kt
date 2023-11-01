package com.example.nobelandroidapp.data.mapper

import com.example.nobelandroidapp.data.remote.dto.FullNameDto
import com.example.nobelandroidapp.domain.model.FullName


fun FullNameDto.toFullName(): FullName {
    return FullName(
        en = en
    )
}