package com.lopniv.movie.api

import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.lopniv.movie.BuildConfig.BASE_URL
import com.lopniv.movie.MyApplication
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ApiModule {

    private val client = OkHttpClient.Builder()
        .addInterceptor(
            ChuckerInterceptor.Builder(MyApplication.getInstance())
                .collector(ChuckerCollector(MyApplication.getInstance()))
                .maxContentLength(250000L)
                .redactHeaders(emptySet())
                .alwaysReadResponseBody(false)
                .build()
        )
        .build()

    @Provides
    fun provideUsersApi(): UsersApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(UsersApi::class.java)
    }

    @Provides()
    fun provideUsersService(): UsersService {
        return UsersService()
    }
}