package com.example.jetpackcomposerecyclerview.data

import com.example.jetpackcomposerecyclerview.R
import com.example.jetpackcomposerecyclerview.data.model.Student

object DataProvider {
    val student =
        Student(
            id = 1,
            name = "Shyam",
            sex = "Male",
            age = 14,
            skill = "Cricket",
            imageId = R.drawable.ic_baseline_person_2_24
        )

    val puppyList = listOf(
        student,
        Student(
            id = 2,
            name = "Usha",
            sex = "Female",
            age = 12,
            skill = "Maths",
            imageId = R.drawable.ic_baseline_person_2_24
        ),
        Student(
            id = 3,
            name = "Vikash",
            sex = "Male",
            age = 8,
            skill = "Football",
            imageId = R.drawable.ic_baseline_person_2_24
        ),
        Student(
            id = 4,
            name = "Naresh",
            sex = "Male",
            age = 10,
            skill = "Cricket",
            imageId = R.drawable.ic_baseline_person_2_24
        ),
        Student(
            id = 5,
            name = "Madhu",
            sex = "Female",
            age = 12,
            skill = "Bollyball",
            imageId = R.drawable.ic_baseline_person_2_24
        ),
        Student(
            id = 6,
            name = "Mahi",
            sex = "Female",
            age = 10,
            skill = "Badminton",
            imageId = R.drawable.ic_baseline_person_2_24
        ),
        Student(
            id = 7,
            name = "Abhishek",
            sex = "Male",
            age = 13,
            skill = "Plants and farming",
            imageId = R.drawable.ic_baseline_person_2_24
        ),
        Student(
            id = 8,
            name = "Aayushi",
            sex = "Female",
            age = 14,
            skill = "Coding",
            imageId = R.drawable.ic_baseline_person_2_24
        ),
        Student(
            id = 9,
            name = "Abhi",
            sex = "Male",
            age = 7,
            skill = "Maths",
            imageId = R.drawable.ic_baseline_person_2_24
        ),
        Student(
            id = 10,
            name = "Kriti",
            sex = "Female",
            age = 10,
            skill = "Drawing",
            imageId = R.drawable.ic_baseline_person_2_24
        ),

    )
}