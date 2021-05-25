package com.lopniv.movie.utils

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.lopniv.movie.api.DaggerApiComponent
import com.lopniv.movie.api.UsersService
import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.data.source.remote.response.MoviesResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class DataHelper {
    fun getMoviePopular() : ArrayList<Movie>{
        val movieList = ArrayList<Movie>()
        val usersService = UsersService()
        usersService.api.getMoviesPopular().enqueue(object : Callback<MoviesResponse> {
            override fun onResponse(
                call: Call<MoviesResponse>,
                response: Response<MoviesResponse>
            ) {
                when(response.code()){
                    200 -> {
                        Log.e("TAG", "SUCCESS: ${response.body()?.results}")
                        for(item in response.body()?.results!!){
                            Log.e("TAG", "ITEM: ${item.title}")
                            val movie = Movie(
                                item.adult,
                                item.imageUrl,
                                item.posterPath,
                                item.genre,
                                item.id,
                                item.originalLanguage,
                                item.originalTitle,
                                item.title,
                                item.overview,
                                item.popularity,
                                item.releaseDate,
                                item.rating,
                                item.video,
                                item.voteCount
                            )
                            Log.e("TAG", "ITEM: $movie")
                            movieList.add(movie)
                        }
                    }
                    else -> Log.e("TAG", "ERROR")
                }
            }

            override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
                Log.e("TAG", "ERROR: ${t.localizedMessage} and ${t.message}")
            }
        })
        return movieList
//        disposable.add(
//            usersService.getMoviesPopular()
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(object : DisposableSingleObserver<MoviesResponse>() {
//                    override fun onSuccess(data: MoviesResponse) {
//                        Log.e("TAG", "SUCCESS GETTING THE MOVIES ${data.results}")
//                        movieList = data.results
//                    }
//
//                    override fun onError(e: Throwable) {}
//                })
//        )
    }

//    fun getMoviePopular(): ArrayList<Movie>?{
//        return movieList
//    }
}