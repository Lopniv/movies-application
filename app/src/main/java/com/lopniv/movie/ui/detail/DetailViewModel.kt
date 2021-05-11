package com.lopniv.movie.ui.detail

import androidx.lifecycle.ViewModel
import com.lopniv.movie.ui.movies.MoviesListAdapter.Companion.KEY_MOVIES
import com.lopniv.movie.data.source.local.entity.Item
import com.lopniv.movie.utils.DataDummy

class DetailViewModel : ViewModel() {

    private var listMovies: ArrayList<Item> = arrayListOf()
    private var listTvShows: ArrayList<Item> = arrayListOf()

    fun getItemDetailData(position: Int, fragment: String): Item {
        listMovies = DataDummy.generateDataMovies()
        listTvShows = DataDummy.generateDataTvShows()
        return if (fragment == KEY_MOVIES){
            listMovies[position]
        } else {
            listTvShows[position]
        }
    }
}