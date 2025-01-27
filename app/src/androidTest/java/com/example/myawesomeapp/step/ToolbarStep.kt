package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.ToolbarElement

class ToolbarStep {
    private val toolbarElement = ToolbarElement()

    fun clickToolbarMenuButton(){
        toolbarElement.toolbarMenuButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun checkToolbarMenuButtonIsDisplayed() {
        toolbarElement.toolbarMenuButton()
            .check(matches(isDisplayed()))
    }

    fun checkToolbarMenuOptionsButtonIsDisplayed() {
        toolbarElement.toolbarMenuOptionsButton()
            .check(matches(isDisplayed()))
    }

    fun checkHomeToolbarIsDisplayed() {
        toolbarElement.toolbarMenuHeading("Home")
            .check(matches(isDisplayed()))
    }

    fun checkGalleryToolbarIsDisplayed() {
        toolbarElement.toolbarMenuHeading("Gallery")
            .check(matches(isDisplayed()))
    }

    fun checkSlideshowToolbarIsDisplayed() {
        toolbarElement.toolbarMenuHeading("Slideshow")
            .check(matches(isDisplayed()))
    }
}