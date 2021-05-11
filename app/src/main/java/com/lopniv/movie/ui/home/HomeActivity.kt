package com.lopniv.movie.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lopniv.movie.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    private lateinit var b: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(b.root)
        setupViewPager()
    }

    private fun setupViewPager(){
        b.viewPagerPlaceholder.adapter = ViewPagerAdapter(supportFragmentManager)
        b.bnv.setNavigationChangeListener { _, position ->
            b.viewPagerPlaceholder.setCurrentItem(position, true)
        }
    }
}