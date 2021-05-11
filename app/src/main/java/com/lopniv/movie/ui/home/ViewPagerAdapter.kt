package com.lopniv.movie.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.lopniv.movie.ui.movies.MoviesFragment
import com.lopniv.movie.ui.tvshows.TvShowsFragment

class ViewPagerAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    private val pages = listOf(
        MoviesFragment(),
        TvShowsFragment()
    )

    override fun getCount(): Int = pages.size

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }
}