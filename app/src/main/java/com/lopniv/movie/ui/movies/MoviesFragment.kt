package com.lopniv.movie.ui.movies

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.lopniv.movie.databinding.FragmentMoviesBinding
import com.lopniv.movie.viewmodel.ViewModelFactory


class MoviesFragment : Fragment() {

    private var binding: FragmentMoviesBinding? = null
    private val b get() = binding!!
    private var imagesBackground: ArrayList<Bitmap> = arrayListOf()

    //private lateinit var adapter: TvShowsAdapter
    private lateinit var adapter: MoviesListAdapter
    private lateinit var viewModel: MoviesViewModel
    private lateinit var factory: ViewModelFactory

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return b.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initiate()
        setupViewPager()
    }

    private fun initiate() {
        factory = ViewModelFactory()
        viewModel = ViewModelProvider(this, factory)[MoviesViewModel::class.java]
        adapter = MoviesListAdapter(arrayListOf(), requireActivity())
        //viewModel = ViewModelProvider(requireActivity()).get(MoviesViewModel::class.java)
    }

    private fun setupViewPager() {
//        viewModel.getItemMovies()
//        viewModel.getItemBlurMovies(requireContext())
        //adapter.updateItem(viewModel.getItemMovies())
        adapter.updateItem(viewModel.getMoviesPopular())
        //adapter.updateItem(viewModel.getItemMovies())
        imagesBackground = viewModel.getItemBlurMovies(requireContext())
        b.viewPagerMovies.adapter = adapter
        b.viewPagerMovies.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                if (position < adapter.count - 1 && position < imagesBackground.size - 1) {
                    b.viewPagerMovies.background = BitmapDrawable(resources, imagesBackground[position])
                } else {
                    b.viewPagerMovies.background = BitmapDrawable(resources, imagesBackground[imagesBackground.size - 1])
                }
            }
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageSelected(position: Int) {}
        })
    }
}