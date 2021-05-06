package com.lopniv.movie.ui.tvshows

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class TvShowsViewModelTest {

    private lateinit var tvShowsViewModel: TvShowsViewModel

    @Before
    fun before(){
        tvShowsViewModel = Mockito.mock(TvShowsViewModel::class.java)
    }

    @Test
    fun returnItemList() {
        tvShowsViewModel = TvShowsViewModel()
        val item = tvShowsViewModel.getItemTvShows()
        assertNotNull(item)
        assertEquals(10, item.size)
    }
}