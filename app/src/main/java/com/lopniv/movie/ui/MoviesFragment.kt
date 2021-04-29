package com.lopniv.movie.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lopniv.movie.R
import com.lopniv.movie.databinding.FragmentMoviesBinding
import com.lopniv.movie.databinding.FragmentTvShowsBinding

class MoviesFragment : Fragment() {

    private var binding: FragmentMoviesBinding? = null
    private val b get() = binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return b.root
    }
}