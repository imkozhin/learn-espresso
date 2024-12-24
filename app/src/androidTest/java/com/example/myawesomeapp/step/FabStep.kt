package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.FabElement

class FabStep {
    private val fabElement = FabElement()

    fun checkFabIsDisplayed(){
        fabElement.fab()
            .check(matches(isDisplayed()))
    }

    fun clickFab(){
        fabElement.fab()
            .perform(click())
    }

    fun checkFabNotificationIsDisplayed(){
        fabElement.fabNotification()
            .check(matches(isDisplayed()))
    }

    fun swipeFabNotification(){
        fabElement.fabNotification()
            .perform(swipeRight())
    }
}