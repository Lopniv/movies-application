package com.lopniv.movie.api

import com.lopniv.movie.data.source.remote.response.MoviesResponse
import io.reactivex.Single
import retrofit2.Call
import javax.inject.Inject

class UsersService {
    @Inject
    lateinit var api: UsersApi
    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getMoviesPopular(): Call<MoviesResponse> {
        return api.getMoviesPopular()
    }
}