package com.lopniv.movie.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lopniv.movie.R
import com.lopniv.movie.model.Item

class MoviesViewModel : ViewModel() {

    private var item: ArrayList<Item> = arrayListOf()
    private var itemLiveData = MutableLiveData<ArrayList<Item>>()

    fun returnItemList(): LiveData<ArrayList<Item>> {
        addItemMovies()
        return itemLiveData
    }

    private fun addItemMovies() {
        item.add(Item("Mortal Kombat", "2021", R.drawable.mortal_kombat,
            "1h 50m", "8.0", "Fantasy, Action, Adventure, Science Fiction, Thriller",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe."))
        item.add(Item("Mortal Kombat", "2021", R.drawable.mortal_kombat,
            "1h 50m", "8.0", "Fantasy, Action, Adventure, Science Fiction, Thriller",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe."))
        item.add(Item("Mortal Kombat", "2021", R.drawable.mortal_kombat,
            "1h 50m", "8.0", "Fantasy, Action, Adventure, Science Fiction, Thriller",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe."))
        item.add(Item("Mortal Kombat", "2021", R.drawable.mortal_kombat,
            "1h 50m", "8.0", "Fantasy, Action, Adventure, Science Fiction, Thriller",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe."))
        item.add(Item("Mortal Kombat", "2021", R.drawable.mortal_kombat,
            "1h 50m", "8.0", "Fantasy, Action, Adventure, Science Fiction, Thriller",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe."))
        itemLiveData.value = item
    }
}