package com.lopniv.movie.data.source.local.entity

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("backdrop_path")
    var imageUrl: String,
    @SerializedName("genre_ids")
    var genre: ArrayList<Int>,
    var title: String,
    var overview: String,
    @SerializedName("release_date")
    var releaseDate: String,
    @SerializedName("vote_average")
    var rating: Int
)