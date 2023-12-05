package com.example.nobelandroidapp.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.nobelandroidapp.common.Constants.API_LIMIT
import com.example.nobelandroidapp.common.Constants.INITIAL_OFFSET
import com.example.nobelandroidapp.data.mapper.toLaureate
import com.example.nobelandroidapp.domain.model.Laureate
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class LaureatePagingSource @Inject constructor(
    private val api: NobelApi,
    private val categoryAbbreviation: String
) : PagingSource<Int, Laureate>() {
    override fun getRefreshKey(state: PagingState<Int, Laureate>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Laureate> {
        val apiOffset = params.key ?: INITIAL_OFFSET
        val pageSize = params.loadSize

        return try {
            val apiResponse = api.getLaureatesByCategory(apiOffset, pageSize,categoryAbbreviation)
            val responseLaureates = apiResponse.laureates.map { it.toLaureate() }
            val nextKey = if (responseLaureates.isEmpty()) {
                null
            } else {
                apiOffset + API_LIMIT
            }
            LoadResult.Page(
                data = responseLaureates,
                prevKey = null,
                nextKey = nextKey
            )
        } catch (e: IOException) {
            LoadResult.Error(e)
        } catch (e: HttpException) {
            LoadResult.Error(e)
        }
    }
}