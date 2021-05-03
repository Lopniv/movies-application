package com.lopniv.movie.ui.tvshows

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lopniv.movie.R
import com.lopniv.movie.model.Item
import com.lopniv.movie.ui.BlurBuilder

class TvShowsViewModel : ViewModel() {
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

    fun addItemTvShows() {
        item.add(Item("Superman & Lois", "2021", R.drawable.superman,
                "1h 04m", "8.3", "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society."))
        item.add(Item("The Falcon and the Winter Soldier", "2021", R.drawable.falcon_and_winter_soldier,
                "50m", "7.0", "Sci-Fi & Fantasy, Action & Adventure, Drama, War & Politics",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience."))
        item.add(Item("Wanda Vision", "2021", R.drawable.wanda_vision,
                "36m", "8.4", "Sci-Fi & Fantasy, Mystery, Drama",
                "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems."))
        item.add(Item("Who Killed Sara?", "2021", R.drawable.who_killed_sara,
                "40m", "7.8", "Drama, Crime, Mystery",
                "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit."))
        item.add(Item("Legacies", "2018", R.drawable.legacies,
                "43m", "8.6", "Sci-Fi & Fantasy, Drama",
                "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted."))
        item.add(Item("Luis Miguel: The Series", "2018", R.drawable.luis_miguel,
                "50m", "8.1", "Drama",
                "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades."))
        item.add(Item("Riverdale", "2017", R.drawable.riverdale,
                "45m", "8.6", "Mystery, Drama, Crime",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade."))
        item.add(Item("The Good Doctor", "2017", R.drawable.good_doctor,
                "43m", "8.6", "Drama",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives."))
        item.add(Item("Lucifer", "2016", R.drawable.lucifer,
                "45m", "8.5", "Crime, Sci-Fi & Fantasy",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape."))
        item.add(Item("The Flash", "2014", R.drawable.flash,
                "44m", "7.7", "Drama, Sci-Fi & Fantasy",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash."))
        itemLiveData.value = item
    }

    fun blurImages(context: Context) {
        val imageList: ArrayList<Int> = arrayListOf()
        imageList.add(R.drawable.superman)
        imageList.add(R.drawable.falcon_and_winter_soldier)
        imageList.add(R.drawable.wanda_vision)
        imageList.add(R.drawable.who_killed_sara)
        imageList.add(R.drawable.legacies)
        imageList.add(R.drawable.luis_miguel)
        imageList.add(R.drawable.riverdale)
        imageList.add(R.drawable.good_doctor)
        imageList.add(R.drawable.lucifer)
        imageList.add(R.drawable.flash)
        images = BlurBuilder.blur(context, imageList)
        imagesLiveData.value = images
    }
}