package com.lopniv.movie.utils

import android.util.Log
import com.lopniv.movie.api.DaggerApiComponent
import com.lopniv.movie.api.UsersService
import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.data.source.remote.response.MoviesResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class DataHelper {
    @Inject
    lateinit var usersService: UsersService
    init {
        DaggerApiComponent.create().inject(this)
    }
    private val disposable = CompositeDisposable()
    private var movieList: ArrayList<Movie> = arrayListOf()

    fun getMoviePopular(): ArrayList<Movie>{
        disposable.add(
            usersService.getMoviesPopular()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<MoviesResponse>() {
                    override fun onSuccess(data: MoviesResponse) {
                        Log.e("TAG", "SUCCESS GETTING THE MOVIES")
                        movieList = data.results
                    }

                    override fun onError(e: Throwable) {}
                })
        )
        return movieList
    }
}