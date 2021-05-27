package com.lopniv.movie.data.source.remote

import android.util.Log
import com.lopniv.movie.api.DaggerApiComponent
import com.lopniv.movie.api.UsersService
import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.data.source.remote.response.MoviesResponse
import io.reactivex.disposables.CompositeDisposable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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

    fun getMoviesPopular(): ArrayList<Movie> {
//        disposable.add(
//            usersService.getMoviesPopular()
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(object : DisposableSingleObserver<MoviesResponse>() {
//                    override fun onSuccess(data: MoviesResponse) {
//                        Log.e("TAG", "SUCCESS GETTING THE MOVIES")
//                        for(item in data.results){
//                            val movie = Movie(
//                                item.adult,
//                                item.imageUrl,
//                                item.posterPath,
//                                item.genre,
//                                item.id,
//                                item.originalLanguage,
//                                item.originalTitle,
//                                item.title,
//                                item.overview,
//                                item.popularity,
//                                item.releaseDate,
//                                item.rating,
//                                item.video,
//                                item.voteCount
//                            )
//                            Log.e("TAG", "SUCCESS GETTING THE MOVIES: $movie")
//                            movieList.add(movie)
//                        }
//                    }
//
//                    override fun onError(e: Throwable) {}
//                })
//        )
        usersService.getMoviesPopular().enqueue(object : Callback<MoviesResponse> {
            override fun onResponse(
                call: Call<MoviesResponse>,
                response: Response<MoviesResponse>
            ) {
                if (response.code() == 200){
                    if (response.body()?.results != null){
                        for (item in response.body()?.results!!) {
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
                            Log.e("TAG", "SUCCESS GETTING THE MOVIES: $movie")
                            movieList.add(movie)
                        }
                    }
                }
            }

            override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
                Log.e("TAG", "SUCCESS GETTING THE MOVIES: ${t.localizedMessage}")
            }
        })
        return movieList
    }
}