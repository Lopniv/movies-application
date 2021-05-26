package com.lopniv.movie.utils

class DataHelper {
//    @Inject
//    lateinit var usersService: UsersService
//    init {
//        DaggerApiComponent.create().inject(this)
//    }
//    private val disposable = CompositeDisposable()
//    private var movieList: ArrayList<Movie> = arrayListOf()
//
//    fun getMoviePopular(): ArrayList<Movie>{
//        disposable.add(
//            usersService.getMoviesPopular()
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(object : DisposableSingleObserver<MoviesResponse>() {
//                    override fun onSuccess(data: MoviesResponse) {
//                        Log.e("TAG", "SUCCESS GETTING THE MOVIES")
//                        movieList = data.results
//                    }
//
//                    override fun onError(e: Throwable) {}
//                })
//        )
//        return movieList
//    }
}