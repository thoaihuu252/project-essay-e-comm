package com.nhom4.project_essay_e_comm.data.remote

import com.nhom4.project_essay_e_comm.Model.Product
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {
    @GET("getId/{id}")
    suspend fun getProductById(@Path("id") id: String): Product

    @GET("getAll")
    suspend fun getProductList() : List<Product>
}