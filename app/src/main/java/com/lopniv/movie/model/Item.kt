package com.lopniv.movie.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item(
    val title: String = "",
    val year: String = "",
    val image: Int = 0,
    val duration: String = "",
    val score: String = "",
    val genre: String = "",
    val description: String = ""
) : Parcelable
