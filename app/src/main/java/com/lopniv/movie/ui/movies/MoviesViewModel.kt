package com.lopniv.movie.ui.movies

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lopniv.movie.R
import com.lopniv.movie.model.Item
import com.lopniv.movie.ui.BlurBuilder
import com.lopniv.movie.ui.BlurBuilder.blur

class MoviesViewModel : ViewModel() {

    private var item: ArrayList<Item> = arrayListOf()
    private var itemLiveData = MutableLiveData<ArrayList<Item>>()
    private var images: ArrayList<Bitmap> = arrayListOf()
    private var imagesLiveData = MutableLiveData<ArrayList<Bitmap>>()

    fun returnItemList(): LiveData<ArrayList<Item>> {
        return itemLiveData
    }

    fun returnImagesList() : LiveData<ArrayList<Bitmap>> {
        return imagesLiveData
    }

    fun addItemMovies() {
        item.add(Item("Chaos Walking", "2021", R.drawable.chaos_walking,
                "1h 49m", "7.4", "Science Fiction, Action, Adventure, Thriller",
                "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone."))
        item.add(Item("Godzilla vs. Kong", "2021", R.drawable.godzilla_vs_kong,
                "1h 59m", "8.2", "Action, Science Fiction, Comedy",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages."))
        item.add(Item("Mortal Kombat", "2021", R.drawable.mortal_kombat,
            "1h 50m", "8.0", "Fantasy, Action, Adventure, Science Fiction, Thriller",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe."))
        item.add(Item("Nobody", "2021", R.drawable.nobody,
            "1h 32m", "8.5", "Action, Thriller, Crime",
            "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a nobody. When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind."))
        item.add(Item("Raya and the Last Dragon", "2021", R.drawable.raya_and_last_dragon,
                "1h 47m", "8.3", "Animation, Adventure, Fantasy, Family, Action",
                "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people."))
        item.add(Item("Space Sweepers", "2021", R.drawable.space_sweeper,
                "2h 16m", "7.2", "Drama, Fantasy, Science Fiction",
                "When the crew of a space junk collector ship called The Victory discovers a humanoid robot named Dorothy that's known to be a weapon of mass destruction, they get involved in a risky business deal which puts their lives at stake."))
        item.add(Item("The Marksman", "2021", R.drawable.the_marksman,
            "1h 48m", "7.1", "Action, Thriller, Crime",
            "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins."))
        item.add(Item("Twist", "2021", R.drawable.twist,
            "1h 30m", "7.0", "Crime, Drama, Action",
            "A Dicken’s classic brought thrillingly up to date in the teeming heartland of modern London, where a group of street smart young hustlers plan the heist of the century for the ultimate payday."))
        item.add(Item("Bad Boys for Life", "2020", R.drawable.bad_boys,
            "2h 04m", "7.2", "Thriller, Action, Crime",
            "Marcus and Mike are forced to confront new threats, career changes, and midlife crises as they join the newly created elite team AMMO of the Miami police department to take down the ruthless Armando Armas, the vicious leader of a Miami drug cartel."))
        item.add(Item("Monster Hunter", "2020", R.drawable.monster_hunter,
            "1h 44m", "7.1", "Fantasy, Action, Adventure",
            "A portal transports Cpt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home."))
        itemLiveData.value = item
    }

    fun blurImages(context: Context) {
        val imageList: ArrayList<Int> = arrayListOf()
        imageList.add(R.drawable.chaos_walking)
        imageList.add(R.drawable.godzilla_vs_kong)
        imageList.add(R.drawable.mortal_kombat)
        imageList.add(R.drawable.nobody)
        imageList.add(R.drawable.raya_and_last_dragon)
        imageList.add(R.drawable.space_sweeper)
        imageList.add(R.drawable.the_marksman)
        imageList.add(R.drawable.twist)
        imageList.add(R.drawable.bad_boys)
        imageList.add(R.drawable.monster_hunter)
        images = blur(context, imageList)
        imagesLiveData.value = images
    }
}