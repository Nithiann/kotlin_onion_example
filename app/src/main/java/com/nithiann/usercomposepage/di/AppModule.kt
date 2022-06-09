package com.nithiann.usercomposepage.di

import com.google.gson.internal.GsonBuildConfig
import com.nithiann.usercomposepage.common.Constants
import com.nithiann.usercomposepage.domain.repository.UserRepository
import com.nithiann.usercomposepage.infrastructure.remote.UserGeneratorApi
import com.nithiann.usercomposepage.infrastructure.repository.UserRepositoryImpl
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
    fun provideUserApi(): UserGeneratorApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserGeneratorApi::class.java)
    }

    @Provides
    @Singleton
    fun provideUserRepository(api: UserGeneratorApi): UserRepository {
        return UserRepositoryImpl(api)
    }
}