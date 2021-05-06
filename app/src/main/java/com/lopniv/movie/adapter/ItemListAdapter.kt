package com.lopniv.movie.adapter

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
import com.lopniv.movie.R
import com.lopniv.movie.model.Item
import com.lopniv.movie.ui.detail.DetailActivity
import com.lopniv.movie.ui.detail.DetailActivity.Companion.KEY_DETAIL
import com.lopniv.movie.ui.detail.DetailActivity.Companion.KEY_POSITION

class ItemListAdapter(var items: ArrayList<Item>, var context: Context, var fragment: String) : PagerAdapter() {

    companion object {
        const val KEY_MOVIES = "MOVIES"
        const val KEY_TV_SHOWS = "TV SHOW"
    }

    fun updateItem(item: ArrayList<Item>) {
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
        val view: View = LayoutInflater.from(container.context).inflate(R.layout.item_list, container, false)
        val ivItem : AppCompatImageView = view.findViewById(R.id.iv_item)
        val tvScore : TextView = view.findViewById(R.id.tv_score)
        val cvItem: CardView = view.findViewById(R.id.cv_item)
        ivItem.setImageResource(items[position].image)
        tvScore.text = items[position].score
        cvItem.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            if (fragment == KEY_MOVIES){
                intent.putExtra(KEY_DETAIL, KEY_MOVIES)
                intent.putExtra(KEY_POSITION, position)
                context.startActivity(intent)
            } else {
                intent.putExtra(KEY_DETAIL, KEY_TV_SHOWS)
                intent.putExtra(KEY_POSITION, position)
                context.startActivity(intent)
            }
        }
        container.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}