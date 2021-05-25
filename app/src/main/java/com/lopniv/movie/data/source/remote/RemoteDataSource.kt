package com.lopniv.movie.data.source.remote

import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.utils.DataHelper
import java.util.*

class RemoteDataSource private constructor(private val dataHelper: DataHelper) {
    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(dataHelper: DataHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(dataHelper).apply { instance = this }
            }
    }

    fun getMoviesPopular(): ArrayList<Movie> {
        //dataHelper.loadData()
        return dataHelper.getMoviePopular()
    }
}