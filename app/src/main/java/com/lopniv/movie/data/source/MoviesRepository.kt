package com.lopniv.movie.data.source

import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.data.source.remote.RemoteDataSource


class MoviesRepository private constructor(private val remoteDataSource: RemoteDataSource) : MoviesDataSource {

    companion object {
        @Volatile
        private var instance: MoviesRepository? = null

        fun getInstance(remoteData: RemoteDataSource): MoviesRepository =
            instance ?: synchronized(this) {
                instance ?: MoviesRepository(remoteData).apply { instance = this }
            }
    }

    override fun getMoviesPopular(): ArrayList<Movie> {
        return remoteDataSource.getMoviesPopular()
    }
}