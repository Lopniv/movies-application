package com.lopniv.movie.ui.detail

import com.lopniv.movie.adapter.ItemListAdapter.Companion.KEY_MOVIES
import com.lopniv.movie.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class DetailViewModelTest {

    private lateinit var detailViewModel: DetailViewModel
    private val dummyMovies = DataDummy.generateDataMovies()[0]

    @Before
    fun before(){
        detailViewModel = Mockito.mock(DetailViewModel::class.java)
    }

    @Test
    fun returnItemData() {
        detailViewModel = DetailViewModel()
        val movies = detailViewModel.getItemDetailData(0, KEY_MOVIES)
        assertNotNull(movies)
        assertEquals(dummyMovies.title, movies.title)
        assertEquals(dummyMovies.year, movies.year)
        assertEquals(dummyMovies.image, movies.image)
        assertEquals(dummyMovies.duration, movies.duration)
        assertEquals(dummyMovies.genre, movies.genre)
        assertEquals(dummyMovies.description, movies.description)
        assertEquals(dummyMovies.score, movies.score)
    }
}