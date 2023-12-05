package com.example.nobelandroidapp.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.nobelandroidapp.common.Constants
import com.example.nobelandroidapp.data.remote.LaureatePagingSource
import com.example.nobelandroidapp.data.remote.NobelApi
import com.example.nobelandroidapp.domain.model.Laureate
import com.example.nobelandroidapp.domain.repository.NobelRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class NobelRepositoryImpl @Inject constructor(
    private val api: NobelApi
) : NobelRepository {

    override  fun getLaureatesByCategory(
        categoryAbbreviation: String
    ): Flow<PagingData<Laureate>> {
        return Pager(
            config = PagingConfig(
                pageSize = Constants.API_LIMIT,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                LaureatePagingSource(api, categoryAbbreviation)
            }
        ).flow
    }

}