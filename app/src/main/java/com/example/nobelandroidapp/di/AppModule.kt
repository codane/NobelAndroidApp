package com.example.nobelandroidapp.di

import androidx.lifecycle.SavedStateHandle
import com.example.nobelandroidapp.common.Constants
import com.example.nobelandroidapp.data.local.NobelPrizeCategories
import com.example.nobelandroidapp.data.remote.NobelApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNobelApi() : NobelApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NobelApi::class.java)
    }

    @Provides
    @Singleton
    fun providePrizeCategories() : NobelPrizeCategories {
        return NobelPrizeCategories()
    }
}