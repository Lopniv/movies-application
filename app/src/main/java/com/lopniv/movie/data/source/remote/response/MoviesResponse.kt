package com.lopniv.movie.data.source.remote.response

import com.lopniv.movie.data.source.local.entity.Movie

data class MoviesResponse(
    var results: ArrayList<Movie>
)