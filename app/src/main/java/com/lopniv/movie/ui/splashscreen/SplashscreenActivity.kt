package com.lopniv.movie.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.lopniv.movie.databinding.ActivitySplashscreenBinding
import com.lopniv.movie.ui.home.HomeActivity

class SplashscreenActivity : AppCompatActivity() {

    private lateinit var b: ActivitySplashscreenBinding

    companion object {
        private const val TIME_LENGTH = 3000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySplashscreenBinding.inflate(layoutInflater)
        setContentView(b.root)
        goToApp()
    }

    private fun goToApp() {
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
        }, TIME_LENGTH.toLong())
    }
}