package com.example.assignment_1

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyUnitTesting {

    @Before
    fun setUp() {
        // Start the MainActivity before each test
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun generateButton_clickWithValidAge_displaysCorrectMessage() {
        // Type a valid age into the age input field
        onView(withId(R.id.viewAge)).perform(typeText("25"))

        // Click on the generate button
        onView(withId(R.id.generateBtn)).perform(click())

        // Check if the correct message is displayed
        onView(withId(R.id.message)).check(matches(withText("20-29 age range just like Tupac Amaru Shakur (2Pac), who is widely considered one of the most influential and successful rappers of all time." +
                "Much of Shakur's music has been noted for addressing contemporary social issues that plagued inner cities. 2pac passed at age 25")))
    }

    @Test
    fun generateButton_clickWithInvalidAge_displaysErrorMessage() {
        // Type an invalid age into the age input field
        onView(withId(R.id.viewAge)).perform(typeText("abc"))

        // Click on the generate button
        onView(withId(R.id.generateBtn)).perform(click())

        // Check if the correct error message is displayed
        onView(withText("Your age must be an integer")).check(matches(isDisplayed()))
    }

    @Test
    fun clearButton_click_clearsFields() {
        // Type an age into the age input field
        onView(withId(R.id.viewAge)).perform(typeText("30"))

        // Click on the clear button
        onView(withId(R.id.clearBtn)).perform(click())

        // Check if both fields are empty after clicking clear
        onView(withId(R.id.viewAge)).check(matches(withText("")))
        onView(withId(R.id.message)).check(matches(withText("")))
    }
}