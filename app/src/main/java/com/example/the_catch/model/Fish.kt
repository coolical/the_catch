package com.example.the_catch.model

import androidx.annotation.DrawableRes

class Fish (
    @DrawableRes
    val imageResourceId: Int,
    val name: String,
    val price: Int,
    val alt: String
        )