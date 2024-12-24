package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.google.android.material.R

class NotificationElement {
    fun notificationText(notificationText: String): ViewInteraction {
        return onView(withText(notificationText))
    }

    fun notificationPopup(): ViewInteraction {
        return onView(withId(R.id.snackbar_text))
    }
}
