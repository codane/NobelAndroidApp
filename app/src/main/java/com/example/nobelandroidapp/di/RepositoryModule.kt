package com.example.nobelandroidapp.di

import com.example.nobelandroidapp.data.repository.NobelRepositoryImpl
import com.example.nobelandroidapp.domain.repository.NobelRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideNobelRepository(nobelRepositoryImpl: NobelRepositoryImpl) : NobelRepository
}