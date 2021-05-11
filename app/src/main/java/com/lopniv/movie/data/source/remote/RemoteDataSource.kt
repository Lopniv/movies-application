package com.lopniv.movie.data.source.remote

import android.util.Log
import com.lopniv.movie.api.UsersService
import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.data.source.remote.response.MoviesResponse
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList

class RemoteDataSource private constructor(private val usersService: UsersService) {
    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: UsersService): RemoteDataSource =
            instance ?: synchronized(this) {
                RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getMoviesPopular(): ArrayList<Movie> {
        var list = ArrayList<Movie>()
        usersService.getMoviesPopular().enqueue(object : Callback<MoviesResponse> {
            override fun onResponse(call: Call<MoviesResponse>, response: Response<MoviesResponse>) {
                Log.e("TAG", "RESPONSE: $response + ${response.body()} + ${response.code()}")
                if (response.isSuccessful){
                    list = response.body()?.results!!
                }
            }
            override fun onFailure(call: Call<MoviesResponse>, error: Throwable) {}
        })
        return list
    }
}