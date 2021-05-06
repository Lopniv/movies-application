package com.lopniv.movie.ui.tvshows

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.lopniv.movie.adapter.ItemListAdapter
import com.lopniv.movie.adapter.ItemListAdapter.Companion.KEY_TV_SHOWS
import com.lopniv.movie.databinding.FragmentTvShowsBinding

class TvShowsFragment : Fragment() {

    private var binding: FragmentTvShowsBinding? = null
    private val b get() = binding!!
    private var imagesBackground: ArrayList<Bitmap> = arrayListOf()

    private lateinit var adapter: ItemListAdapter
    private lateinit var viewModel: TvShowsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentTvShowsBinding.inflate(inflater, container, false)
        return b.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initiate()
        setupViewPager()
    }

    private fun initiate() {
        adapter = ItemListAdapter(arrayListOf(), requireActivity(), KEY_TV_SHOWS)
        viewModel = ViewModelProvider(requireActivity()).get(TvShowsViewModel::class.java)
    }

    private fun setupViewPager() {
        adapter.updateItem(viewModel.getItemTvShows())
        imagesBackground = viewModel.getItemBlurTvShows(requireContext())
        b.viewPagerTvShows.adapter = adapter
        b.viewPagerTvShows.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                if (position < adapter.count - 1 && position < imagesBackground.size - 1) {
                    b.viewPagerTvShows.background = BitmapDrawable(resources, imagesBackground[position])
                } else {
                    b.viewPagerTvShows.background = BitmapDrawable(resources, imagesBackground[imagesBackground.size - 1])
                }
            }
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageSelected(position: Int) {}
        })
    }
}