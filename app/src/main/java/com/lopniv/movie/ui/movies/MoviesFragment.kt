package com.lopniv.movie.ui.movies

import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.lopniv.movie.R
import com.lopniv.movie.adapter.ItemListAdapter
import com.lopniv.movie.databinding.FragmentMoviesBinding
import com.lopniv.movie.ui.BlurBuilder.blur


class MoviesFragment : Fragment() {

    private var binding: FragmentMoviesBinding? = null
    private val b get() = binding!!

    private lateinit var adapter: ItemListAdapter
    private lateinit var viewModel: MoviesViewModel

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
        adapter = ItemListAdapter(arrayListOf())
        viewModel = ViewModelProvider(requireActivity()).get(MoviesViewModel::class.java)
    }

    private fun setupViewPager() {
        viewModel.returnItemList().observe(viewLifecycleOwner, { item ->
            adapter.updateItem(item)
        })
        b.viewPager.adapter = adapter
        val originalBitmap = BitmapFactory.decodeResource(activity?.resources, R.drawable.mortal_kombat)
        val blurredBitmap = blur(activity, originalBitmap)
        b.viewPager.background = BitmapDrawable(resources, blurredBitmap)
    }


}