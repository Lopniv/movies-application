package com.lopniv.movie.ui.movies

import android.content.Context
import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.lopniv.movie.api.DaggerApiComponent
import com.lopniv.movie.data.source.MoviesRepository
import com.lopniv.movie.data.source.local.entity.Item
import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.utils.DataDummy
import javax.inject.Inject

class MoviesViewModel : ViewModel() {
    @Inject
    lateinit var moviesRepository: MoviesRepository
    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getItemMovies(): ArrayList<Item> = DataDummy.generateDataMovies()

    fun getItemBlurMovies(context: Context): ArrayList<Bitmap> = DataDummy.generateImagesBlurMovies(context)

    fun getMoviesPopular(): ArrayList<Movie> = moviesRepository.getMoviesPopular()
}