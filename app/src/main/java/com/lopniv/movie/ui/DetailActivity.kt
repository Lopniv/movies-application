package com.lopniv.movie.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lopniv.movie.R
import com.lopniv.movie.databinding.ActivityDetailBinding
import com.lopniv.movie.model.Item

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val KEY_DETAIL = "DETAIL"
    }

    private lateinit var b: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(b.root)
        setListener()
        retreiveData()
    }

    private fun setListener() {
        b.btnBack.setOnClickListener(this)
    }

    private fun retreiveData() {
        val intent = intent.getParcelableExtra<Item>(KEY_DETAIL)
        if (intent != null) {
            setupItem(intent)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setupItem(item: Item) {
        b.ivImage.setImageResource(item.image)
        b.tvTitle.text = "${item.title} (${item.year})"
        b.tvGenre.text = item.genre
        b.tvScore.text = item.score
        b.tvDuration.text = item.duration
        b.tvDescription.text = item.description
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_back) {
            finish()
        }
    }
}