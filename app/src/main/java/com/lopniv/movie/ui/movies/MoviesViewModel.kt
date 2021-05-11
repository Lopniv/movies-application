package com.lopniv.movie.ui.movies

import android.content.Context
import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.lopniv.movie.data.source.MoviesRepository
import com.lopniv.movie.data.source.local.entity.Item
import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.data.source.remote.response.MoviesResponse
import com.lopniv.movie.utils.DataDummy
import io.reactivex.Single

class MoviesViewModel(private val moviesRepository: MoviesRepository) : ViewModel() {

    fun getItemMovies(): ArrayList<Item> = DataDummy.generateDataMovies()

    fun getItemBlurMovies(context: Context): ArrayList<Bitmap> = DataDummy.generateImagesBlurMovies(context)

    fun getMoviesPopular(): ArrayList<Movie> = moviesRepository.getMoviesPopular()
}