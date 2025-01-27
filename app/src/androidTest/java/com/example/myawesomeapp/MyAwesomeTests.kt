package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.GalleryStep
import com.example.myawesomeapp.step.GreenButtonStep
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.MenuStep
import com.example.myawesomeapp.step.NotificationStep
import com.example.myawesomeapp.step.SlideshowStep
import com.example.myawesomeapp.step.ToolbarStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyAwesomeTests {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val greenButton = GreenButtonStep()
    private val gallery = GalleryStep()
    private val main = MainScreenStep()
    private val menu = MenuStep()
    private val notification = NotificationStep()
    private val slideshow = SlideshowStep()
    private val toolbar = ToolbarStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkMainScreen() {
        main.checkMainScreenTextIsDisplayed()
    }

    @Test
    fun checkSlideshowScreen() {
        toolbar.clickToolbarMenuButton()
        menu.clickMenuSlideshowButton()
        menu.checkMenuSlideshowButtonIsChecked()
        toolbar.checkToolbarMenuButtonIsDisplayed()
        toolbar.checkToolbarMenuOptionsButtonIsDisplayed()
        toolbar.checkSlideshowToolbarIsDisplayed()
        slideshow.checkSlideshowScreenTextIsDisplayed()
    }

    @Test
    fun checkMenuComposition() {
        toolbar.checkToolbarMenuButtonIsDisplayed()
        toolbar.checkToolbarMenuOptionsButtonIsDisplayed()
        toolbar.checkHomeToolbarIsDisplayed()
        toolbar.clickToolbarMenuButton()
        menu.checkMenuImageViewIsDisplayed()
        menu.checkMenuNameIsDisplayed()
        menu.checkMenuEmailIsDisplayed()
        menu.checkMenuHomeButtonIsDisplayed()
        menu.checkMenuSlideshowButtonIsDisplayed()
        menu.checkMenuGalleryButtonIsDisplayed()
        menu.clickMenuHomeButton()
        menu.checkMenuHomeButtonIsChecked()
        main.checkMainScreenTextIsDisplayed()
    }

    @Test
    fun checkGreenButton(){
        main.checkMainScreenTextIsDisplayed()
        greenButton.checkGreenButtonIsDisplayed()
        greenButton.clickGreenButton()
        greenButton.checkGreenButtonNotificationIsDisplayed()
        greenButton.swipeGreenButtonNotification()
    }

    @Test
    fun checkNotificationOnGalleryScreen(){
        toolbar.clickToolbarMenuButton()
        menu.clickMenuGalleryButton()
        menu.checkMenuGalleryButtonIsChecked()
        toolbar.checkToolbarMenuButtonIsDisplayed()
        toolbar.checkToolbarMenuOptionsButtonIsDisplayed()
        toolbar.checkGalleryToolbarIsDisplayed()
        gallery.checkGalleryRecycleViewIsDisplayed()
        gallery.clickGalleryItemListFirstPosition()
        notification.checkGalleryNotificationTextIsDisplayed("1")
        notification.swipeGalleryNotificationPopup()
        gallery.swipeGalleryRecycleView()
        gallery.clickGalleryItemListTenthPosition()
        notification.checkGalleryNotificationTextIsDisplayed("10")
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}