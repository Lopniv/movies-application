package com.lopniv.movie.ui.detail

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.lopniv.movie.R
import com.lopniv.movie.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class DetailActivityTest {

    private val dummyTvShows = DataDummy.generateDataTvShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(DetailActivity::class.java)

    @Test
    fun loadPlaceholderItem() {
        onView(withId(R.id.iv_image)).check(matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.tv_duration)).check(matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.tv_score)).check(matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.tv_overview)).check(matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun loadDetailItem() {
        onView(withId(R.id.tv_title)).check(matches(withText("${dummyTvShows[0].title} (${dummyTvShows[0].year})")))
        onView(withId(R.id.tv_duration)).check(matches(withText(dummyTvShows[0].duration)))
        onView(withId(R.id.tv_score)).check(matches(withText(dummyTvShows[0].score)))
        onView(withId(R.id.tv_description)).check(matches(withText(dummyTvShows[0].description)))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyTvShows[0].genre)))
    }
}