package com.nhom4.project_essay_e_comm.di

import com.nhom4.project_essay_e_comm.data.remote.ProductApi
import com.nhom4.project_essay_e_comm.repository.ProductRepository
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
    const val  BASE_URL = "http://192.168.1.129:8080/api/product/"
    @Singleton
    @Provides
    fun provideProductRepository(
        api : ProductApi
    ) = ProductRepository(api)
    @Singleton
    @Provides
    fun provideProductApi(): ProductApi{
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build().create(ProductApi::class.java)
    }
}