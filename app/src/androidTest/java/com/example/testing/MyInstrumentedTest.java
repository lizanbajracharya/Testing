package com.example.testing;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MyInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> testRule=new ActivityTestRule<>(MainActivity.class);
    public String result="10.0";

    @Test
    public void testAddition(){
        onView(withId(R.id.etFirst)).perform(typeText("6"));

        onView(withId(R.id.etSecond)).perform(typeText("4"));

        onView(withId(R.id.btnAdd)).perform(click());

        closeSoftKeyboard();

        onView(withId(R.id.tvResult)).check(matches(withText(result)));
    }
}
