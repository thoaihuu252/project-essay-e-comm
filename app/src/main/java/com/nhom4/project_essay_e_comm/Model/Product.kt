package com.nhom4.project_essay_e_comm.Model

data class Product(
    val idProduct: Long,
    val nameProduct: String,
    val priceProduct: Int,
    val quantity: Int,
    val imgProduct: List<String>,
    val evaluate: List<Any>
)