package com.example.paulino.bootcampv2;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {
    @Test
    public void greetingRendersName() {

        Intent i = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        i.putExtra("name", "Carl");

        ActivityScenario scenario = ActivityScenario.launch(i);

        Espresso.onView(withId(R.id.textGreeting)).check(matches(withText("Welcome to the Bootcamp, Carl")));

        scenario.close();
    }
}
