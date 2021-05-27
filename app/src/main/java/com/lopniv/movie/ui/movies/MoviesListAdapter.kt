package com.lopniv.movie.ui.movies

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.appcompat.widget.AppCompatImageView
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.request.RequestOptions
import com.lopniv.movie.R
import com.lopniv.movie.data.source.local.entity.Movie
import com.lopniv.movie.ui.detail.DetailActivity
import com.lopniv.movie.ui.detail.DetailActivity.Companion.KEY_DETAIL
import com.lopniv.movie.ui.detail.DetailActivity.Companion.KEY_POSITION


class MoviesListAdapter(var items: ArrayList<Movie>, var context: Context) : PagerAdapter() {

    companion object {
        const val KEY_MOVIES = "MOVIES"
    }

    fun updateItem(item: ArrayList<Movie>) {
        items.clear()
        items.addAll(item)
        notifyDataSetChanged()
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun isViewFromObject(@NonNull view: View, @NonNull `object`: Any): Boolean {
        return view == `object`
    }

    @NonNull
    override fun instantiateItem(@NonNull container: ViewGroup, position: Int): Any {
        val view: View = LayoutInflater.from(container.context).inflate(
            R.layout.item_list,
            container,
            false
        )
        val ivItem : AppCompatImageView = view.findViewById(R.id.iv_item)
        val tvScore : TextView = view.findViewById(R.id.tv_score)
        val cvItem: CardView = view.findViewById(R.id.cv_item)


        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher_round)
            .error(R.mipmap.ic_launcher_round)

        //Glide.with(context).load("https://image.tmdb.org/t/p/w500${items[position].imageUrl}").apply(options).into(ivItem)
        //ivItem.setImageResource(items[position].image)
        tvScore.text = items[position].rating.toString()
        cvItem.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(KEY_DETAIL, KEY_MOVIES)
            intent.putExtra(KEY_POSITION, position)
            context.startActivity(intent)
        }
        container.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}