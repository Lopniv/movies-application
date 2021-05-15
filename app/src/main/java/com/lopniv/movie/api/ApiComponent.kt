package com.lopniv.movie.api

import com.lopniv.movie.utils.DataHelper
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(service: UsersService)
    fun inject(dataHelper: DataHelper)
}