package com.example.jetpackcomposerecyclerview.data.model

import java.io.Serializable

data class Student(
    val id: Int,
    val name: String,
    val sex: String,
    val age: Int,
    val skill: String,
    val imageId: Int = 0,
) : Serializable

