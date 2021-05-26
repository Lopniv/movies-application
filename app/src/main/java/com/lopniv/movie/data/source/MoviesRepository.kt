package com.lopniv.movie.data.source

import com.lopniv.movie.api.DaggerApiComponent
import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.data.source.remote.RemoteDataSource
import javax.inject.Inject

//class MoviesRepository private constructor(private val remoteDataSource: RemoteDataSource) : MoviesDataSource {
//
//    companion object {
//        @Volatile
//        private var instance: MoviesRepository? = null
//
//        fun getInstance(remoteData: RemoteDataSource): MoviesRepository =
//            instance ?: synchronized(this) {
//                MoviesRepository(remoteData).apply { instance = this }
//            }
//    }
//
//    override fun getMoviesPopular(): ArrayList<Movie> {
//        return remoteDataSource.getMoviesPopular()
//    }
//}

class MoviesRepository : MoviesDataSource {
    @Inject
    lateinit var remoteDataSource: RemoteDataSource
    init {
        DaggerApiComponent.create().inject(this)
    }

    override fun getMoviesPopular(): ArrayList<Movie> {
        return remoteDataSource.getMoviesPopular()
    }
}