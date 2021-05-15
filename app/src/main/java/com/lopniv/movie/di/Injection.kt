package com.lopniv.movie.di

import com.lopniv.movie.data.source.MoviesRepository
import com.lopniv.movie.data.source.remote.RemoteDataSource
import com.lopniv.movie.utils.DataHelper

object Injection {
    fun provideRepository(): MoviesRepository {

        val remoteDataSource = RemoteDataSource.getInstance(DataHelper())

        return MoviesRepository.getInstance(remoteDataSource)
    }
}