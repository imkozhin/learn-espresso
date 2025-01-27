package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GreenButtonElement

class GreenButtonStep {
    private val greenButtonElement = GreenButtonElement()

    fun checkGreenButtonIsDisplayed(){
        greenButtonElement.greenButton()
            .check(matches(isDisplayed()))
    }

    fun clickGreenButton(){
        greenButtonElement.greenButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun checkGreenButtonNotificationIsDisplayed(){
        greenButtonElement.greenButtonNotification()
            .check(matches(isDisplayed()))
    }

    fun swipeGreenButtonNotification(){
        greenButtonElement.greenButtonNotification()
            .check(matches(isDisplayed()))
            .perform(swipeRight())
    }
}