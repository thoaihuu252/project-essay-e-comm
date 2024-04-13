package com.nhom4.project_essay_e_comm.ulti

sealed class Resource<T> (
    val data:T? =null,
    val message : String? = null
){
    class Success<T>( data: T): Resource<T>(data)
    class Error<T>(message:String,data: T? = null): Resource<T>(data,message)

}