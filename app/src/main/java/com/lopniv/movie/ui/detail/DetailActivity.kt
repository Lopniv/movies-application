package com.lopniv.movie.ui.detail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.lopniv.movie.R
import com.lopniv.movie.adapter.ItemListAdapter.Companion.KEY_MOVIES
import com.lopniv.movie.adapter.ItemListAdapter.Companion.KEY_TV_SHOWS
import com.lopniv.movie.databinding.ActivityDetailBinding
import com.lopniv.movie.model.Item

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val KEY_DETAIL = "DETAIL"
        const val KEY_POSITION = "POSITION"
    }

    private lateinit var b: ActivityDetailBinding
    private lateinit var detailViewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(b.root)
        setListener()
        initiate()
        retrieveIntent()
    }

    private fun setListener() {
        b.btnBack.setOnClickListener(this)
    }

    private fun initiate() {
        detailViewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
    }

    private fun retrieveIntent() {
        val fragment = intent.getStringExtra(KEY_DETAIL)
        val position = intent.getIntExtra(KEY_POSITION, 0)
        if (fragment == KEY_MOVIES){
            setupItem(detailViewModel.getItemDetailData(position, KEY_MOVIES))
        } else {
            setupItem(detailViewModel.getItemDetailData(position, KEY_TV_SHOWS))
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