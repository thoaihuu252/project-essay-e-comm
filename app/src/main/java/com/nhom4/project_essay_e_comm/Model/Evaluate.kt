package com.nhom4.project_essay_e_comm.Model

import java.util.Date

data class Evaluate(
    val idEvaluate: Long,
    val contentEvaluate: String,
    val starEvaluate: Int,
    val numLike: Int,
    val dateEvaluate: Date
)