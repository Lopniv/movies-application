package com.lopniv.movie.ui.movies

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

class MoviesViewModelTest {

    private lateinit var moviesViewModel: MoviesViewModel

    @Before
    fun before(){
        moviesViewModel = mock(MoviesViewModel::class.java)
    }

    @Test
    fun returnItemList() {
        moviesViewModel = MoviesViewModel()
        val item = moviesViewModel.getItemMovies()
        assertNotNull(item)
        assertEquals(10, item.size)
    }
}