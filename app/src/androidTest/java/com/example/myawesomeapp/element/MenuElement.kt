package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class MenuElement {
    fun menuImageView(): ViewInteraction {
        return onView(withId(R.id.imageView))
    }

    fun menuName(): ViewInteraction {
        return onView(withText("Android Studio"))
    }

    fun menuEmail(): ViewInteraction {
        return onView(withText("android.studio@android.com"))
    }

    fun menuHomeButton(): ViewInteraction {
        return onView(
            allOf(
                withText("Home"),
                isDescendantOfA(withId(R.id.nav_home))
            )
        )
    }

    fun menuGalleryButton(): ViewInteraction {
        return onView(
            allOf(
                withText("Gallery"),
                isDescendantOfA(withId(R.id.nav_gallery))
            )
        )
    }

    fun menuSlideshowButton(): ViewInteraction {
        return onView(
            allOf(
                withText("Slideshow"),
                isDescendantOfA(withId(R.id.nav_slideshow))
            )
        )
    }

}