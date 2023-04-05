package com.example.razmik_hw3.newsResources

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class newsResources(
    @StringRes val nameResourceId: Int,
    @StringRes val authorResourceId: Int,
    @StringRes val titleResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

data class News(
    val name: String,
    val author: String,
    val title: String,
    val imageUrl: String
)