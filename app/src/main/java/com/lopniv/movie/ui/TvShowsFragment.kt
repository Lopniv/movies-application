package com.lopniv.movie.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lopniv.movie.R
import com.lopniv.movie.databinding.FragmentTvShowsBinding

class TvShowsFragment : Fragment() {

    private var binding: FragmentTvShowsBinding? = null
    private val b get() = binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentTvShowsBinding.inflate(inflater, container, false)
        return b.root
    }
}