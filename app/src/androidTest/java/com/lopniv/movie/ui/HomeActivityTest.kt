package com.lopniv.movie.ui

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.lopniv.movie.R
import com.lopniv.movie.ui.home.HomeActivity
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadPlaceholderItem() {
        Espresso.onView(withId(R.id.view_pager_placeholder))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.bnv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}