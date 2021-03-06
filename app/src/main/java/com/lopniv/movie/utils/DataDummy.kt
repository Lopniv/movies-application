package com.lopniv.movie.utils

import android.content.Context
import android.graphics.Bitmap
import com.lopniv.movie.R
import com.lopniv.movie.data.source.local.entity.Item

object DataDummy {

    fun generateDataMovies() : ArrayList<Item> {
        val item = ArrayList<Item>()

        item.add(
            Item("Chaos Walking", "2021", R.drawable.chaos_walking,
            "1h 49m", "7.4", "Science Fiction, Action, Adventure, Thriller",
            "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.")
        )
        item.add(
            Item("Godzilla vs. Kong", "2021", R.drawable.godzilla_vs_kong,
            "1h 59m", "8.2", "Action, Science Fiction, Comedy",
            "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.")
        )
        item.add(
            Item("Mortal Kombat", "2021", R.drawable.mortal_kombat,
            "1h 50m", "8.0", "Fantasy, Action, Adventure, Science Fiction, Thriller",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.")
        )
        item.add(
            Item("Nobody", "2021", R.drawable.nobody,
            "1h 32m", "8.5", "Action, Thriller, Crime",
            "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a nobody. When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.")
        )
        item.add(
            Item("Raya and the Last Dragon", "2021", R.drawable.raya_and_last_dragon,
            "1h 47m", "8.3", "Animation, Adventure, Fantasy, Family, Action",
            "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.")
        )
        item.add(
            Item("Space Sweepers", "2021", R.drawable.space_sweeper,
            "2h 16m", "7.2", "Drama, Fantasy, Science Fiction",
            "When the crew of a space junk collector ship called The Victory discovers a humanoid robot named Dorothy that's known to be a weapon of mass destruction, they get involved in a risky business deal which puts their lives at stake.")
        )
        item.add(
            Item("The Marksman", "2021", R.drawable.the_marksman,
            "1h 48m", "7.1", "Action, Thriller, Crime",
            "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.")
        )
        item.add(
            Item("Twist", "2021", R.drawable.twist,
            "1h 30m", "7.0", "Crime, Drama, Action",
            "A Dicken’s classic brought thrillingly up to date in the teeming heartland of modern London, where a group of street smart young hustlers plan the heist of the century for the ultimate payday.")
        )
        item.add(
            Item("Bad Boys for Life", "2020", R.drawable.bad_boys,
            "2h 04m", "7.2", "Thriller, Action, Crime",
            "Marcus and Mike are forced to confront new threats, career changes, and midlife crises as they join the newly created elite team AMMO of the Miami police department to take down the ruthless Armando Armas, the vicious leader of a Miami drug cartel.")
        )
        item.add(
            Item("Monster Hunter", "2020", R.drawable.monster_hunter,
            "1h 44m", "7.1", "Fantasy, Action, Adventure",
            "A portal transports Cpt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home.")
        )

        return item
    }

    fun generateDataTvShows() : ArrayList<Item> {
        val item = ArrayList<Item>()

        item.add(
            Item("Superman & Lois", "2021", R.drawable.superman,
            "1h 04m", "8.3", "Action & Adventure, Sci-Fi & Fantasy, Drama",
            "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.")
        )
        item.add(
            Item("The Falcon and the Winter Soldier", "2021", R.drawable.falcon_and_winter_soldier,
            "50m", "7.0", "Sci-Fi & Fantasy, Action & Adventure, Drama, War & Politics",
            "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.")
        )
        item.add(
            Item("Wanda Vision", "2021", R.drawable.wanda_vision,
            "36m", "8.4", "Sci-Fi & Fantasy, Mystery, Drama",
            "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.")
        )
        item.add(
            Item("Who Killed Sara?", "2021", R.drawable.who_killed_sara,
            "40m", "7.8", "Drama, Crime, Mystery",
            "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.")
        )
        item.add(
            Item("Legacies", "2018", R.drawable.legacies,
            "43m", "8.6", "Sci-Fi & Fantasy, Drama",
            "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted.")
        )
        item.add(
            Item("Luis Miguel: The Series", "2018", R.drawable.luis_miguel,
            "50m", "8.1", "Drama",
            "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.")
        )
        item.add(
            Item("Riverdale", "2017", R.drawable.riverdale,
            "45m", "8.6", "Mystery, Drama, Crime",
            "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.")
        )
        item.add(
            Item("The Good Doctor", "2017", R.drawable.good_doctor,
            "43m", "8.6", "Drama",
            "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives.")
        )
        item.add(
            Item("Lucifer", "2016", R.drawable.lucifer,
            "45m", "8.5", "Crime, Sci-Fi & Fantasy",
            "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.")
        )
        item.add(
            Item("The Flash", "2014", R.drawable.flash,
            "44m", "7.7", "Drama, Sci-Fi & Fantasy",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.")
        )

        return item
    }

    fun generateImagesBlurMovies(context: Context) : ArrayList<Bitmap> {
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
        return BlurBuilder.blur(context, imageList)
    }

    fun generateImagesBlurTvShows(context: Context) : ArrayList<Bitmap> {
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
        return BlurBuilder.blur(context, imageList)
    }
}