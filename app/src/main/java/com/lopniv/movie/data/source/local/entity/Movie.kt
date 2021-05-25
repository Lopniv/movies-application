package com.lopniv.movie.data.source.local.entity

import com.google.gson.annotations.SerializedName

data class Movie(
    var adult: Boolean,
    @SerializedName("backdrop_path")
    var imageUrl: String,
    @SerializedName("poster_path")
    var posterPath: String,
    @SerializedName("genre_ids")
    var genre: ArrayList<Int>,
    var id: Int,
    @SerializedName("original_language")
    var originalLanguage: String,
    @SerializedName("original_title")
    var originalTitle: String,
    var title: String,
    var overview: String,
    var popularity: Double,
    @SerializedName("release_date")
    var releaseDate: String,
    @SerializedName("vote_average")
    var rating: Double,
    var video: Boolean,
    @SerializedName("vote_count")
    var voteCount: Double,
)