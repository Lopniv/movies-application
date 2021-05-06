package com.lopniv.movie.ui.movies

import android.content.Context
import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.lopniv.movie.model.Item
import com.lopniv.movie.utils.DataDummy

class MoviesViewModel : ViewModel() {

    fun getItemMovies(): ArrayList<Item> = DataDummy.generateDataMovies()

    fun getItemBlurMovies(context: Context): ArrayList<Bitmap> = DataDummy.generateImagesBlurMovies(context)
}