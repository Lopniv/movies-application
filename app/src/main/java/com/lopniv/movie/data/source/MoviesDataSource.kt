package com.lopniv.movie.data.source

import com.lopniv.movie.data.source.local.entity.Movie

interface MoviesDataSource {

    fun getMoviesPopular(): ArrayList<Movie>
}