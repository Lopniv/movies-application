package com.lopniv.movie.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lopniv.movie.api.DaggerApiComponent
import com.lopniv.movie.data.source.MoviesRepository
import com.lopniv.movie.ui.movies.MoviesViewModel
import javax.inject.Inject

//class ViewModelFactory private constructor(private val moviesRepository: MoviesRepository) : ViewModelProvider.NewInstanceFactory() {
//
//    companion object {
//        @Volatile
//        private var instance: ViewModelFactory? = null
//
//        fun getInstance(context: Context): ViewModelFactory =
//            instance ?: synchronized(this) {
//                ViewModelFactory(Injection.provideRepository()).apply {
//                    instance = this
//                }
//            }
//    }
//
//    @Suppress("UNCHECKED_CAST")
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return when {
//            modelClass.isAssignableFrom(MoviesViewModel::class.java) -> {
//                MoviesViewModel(moviesRepository) as T
//            }
//            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
//        }
//    }
//}

class ViewModelFactory : ViewModelProvider.NewInstanceFactory() {
    @Inject
    lateinit var moviesRepository: MoviesRepository
    init {
        DaggerApiComponent.create().inject(this)
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MoviesViewModel::class.java) -> {
                MoviesViewModel() as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
}