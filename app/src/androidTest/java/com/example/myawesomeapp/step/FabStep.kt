package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.FabElement

class FabStep {
    private val fabElement = FabElement()

    fun checkGreenButtonIsDisplayed(){
        fabElement.fab()
            .check(matches(isDisplayed()))
    }

    fun clickGreenButton(){
        fabElement.fab()
            .perform(click())
    }

    fun checkGreenButtonNotificationIsDisplayed(){
        fabElement.fabNotification()
            .check(matches(isDisplayed()))
    }

    fun swipeGreenButtonNotification(){
        fabElement.fabNotification()
            .check(matches(isDisplayed()))
            .perform(swipeRight())
    }
}