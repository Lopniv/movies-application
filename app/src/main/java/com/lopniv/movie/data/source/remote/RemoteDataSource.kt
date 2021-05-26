package com.lopniv.movie.data.source.remote

import android.util.Log
import com.lopniv.movie.api.DaggerApiComponent
import com.lopniv.movie.api.UsersService
import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.data.source.remote.response.MoviesResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import java.util.*
import javax.inject.Inject

//class RemoteDataSource private constructor(private val dataHelper: DataHelper) {
//    companion object {
//        @Volatile
//        private var instance: RemoteDataSource? = null
//
//        fun getInstance(dataHelper: DataHelper): RemoteDataSource =
//            instance ?: synchronized(this) {
//                RemoteDataSource(dataHelper).apply { instance = this }
//            }
//    }
//}
class RemoteDataSource {
    @Inject
    lateinit var usersService: UsersService
    init {
        DaggerApiComponent.create().inject(this)
    }

    private val disposable = CompositeDisposable()
    private var movieList: ArrayList<Movie> = arrayListOf()

    fun getMoviesPopular(): ArrayList<Movie>{
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