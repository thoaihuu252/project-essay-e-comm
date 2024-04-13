package com.nhom4.project_essay_e_comm.repository

import com.nhom4.project_essay_e_comm.data.remote.ProductApi
import com.nhom4.project_essay_e_comm.Model.Product
import com.nhom4.project_essay_e_comm.ulti.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ProductRepository @Inject constructor(
    private val api : ProductApi
){
    suspend fun getProductList() : Resource<List<Product>>{
        val reponse = try {
            api.getProductList()
        }catch (e:Exception){
            return Resource.Error("Error")
        }
        return Resource.Success(reponse)
    }
}