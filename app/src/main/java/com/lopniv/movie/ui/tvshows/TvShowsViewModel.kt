package com.lopniv.movie.ui.tvshows

import android.content.Context
import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.lopniv.movie.model.Item
import com.lopniv.movie.utils.DataDummy

class TvShowsViewModel : ViewModel() {

    fun getItemTvShows(): ArrayList<Item> = DataDummy.generateDataTvShows()

    fun getItemBlurTvShows(context: Context): ArrayList<Bitmap> = DataDummy.generateImagesBlurTvShows(context)
}