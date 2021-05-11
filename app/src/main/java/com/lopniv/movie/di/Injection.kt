package com.lopniv.movie.di

import android.content.Context
import com.lopniv.movie.api.UsersService
import com.lopniv.movie.data.source.MoviesRepository
import com.lopniv.movie.data.source.remote.RemoteDataSource

object Injection {
    fun provideRepository(context: Context): MoviesRepository {

        val remoteDataSource = RemoteDataSource.getInstance(UsersService())

        return MoviesRepository.getInstance(remoteDataSource)
    }
}