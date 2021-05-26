package com.lopniv.movie.api

import com.lopniv.movie.data.source.MoviesRepository
import com.lopniv.movie.data.source.remote.RemoteDataSource
import com.lopniv.movie.ui.movies.MoviesViewModel
import com.lopniv.movie.viewmodel.ViewModelFactory
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(service: UsersService)
    fun inject(remoteDataSource: RemoteDataSource)
    fun inject(moviesRepository: MoviesRepository)
    fun inject(viewModelFactory: ViewModelFactory)
    fun inject(moviesViewModel: MoviesViewModel)
}