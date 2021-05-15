package com.lopniv.movie.api

import com.lopniv.movie.data.source.remote.response.MoviesResponse
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET

interface UsersApi {

    @GET("movie/popular?api_key=23ebd4f5f215f63e4bf98097180d56ea&language=en-US&page=1")
    fun getMoviesPopular(): Single<MoviesResponse>
}