package me.wingsdevops.www.practicalayouts;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void setUp() throws Exception {
        System.out.println("Starting test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Finished test");
    }

    @Test
    public void onClickOne() {
        onView(withId(R.id.navigation_constraint)).perform(click());
        onView(withId(R.id.btn_one)).perform(click());
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("You clicked the first button")))
                .check(matches(isDisplayed()));
    }

    @Test
    public void onClickTwo() {
        onView(withId(R.id.navigation_constraint)).perform(click());
        onView(withId(R.id.btn_two)).perform(click());
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("You clicked the second button")))
                .check(matches(isDisplayed()));
    }

    @Test
    public void onClickThree() {
        onView(withId(R.id.navigation_constraint)).perform(click());
        onView(withId(R.id.btn_three)).perform(click());
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("You clicked the third button")))
                .check(matches(isDisplayed()));
    }

    @Test
    public void onClickFour() {
        onView(withId(R.id.navigation_constraint)).perform(click());
        onView(withId(R.id.btn_four)).perform(click());
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("You clicked the fourth button")))
                .check(matches(isDisplayed()));
    }

    @Test
    public void onClickFive() {
        onView(withId(R.id.navigation_constraint)).perform(click());
        onView(withId(R.id.btn_five)).perform(click());
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("You clicked the fifth button")))
                .check(matches(isDisplayed()));
    }

    @Test
    public void onClickSix() {
        onView(withId(R.id.navigation_constraint)).perform(click());
        onView(withId(R.id.btn_six)).perform(click());
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("You clicked the sixth button")))
                .check(matches(isDisplayed()));
    }

    @Test
    public void onClickSeven() {
        onView(withId(R.id.navigation_constraint)).perform(click());
        onView(withId(R.id.btn_seven)).perform(click());
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("You clicked the seventh button")))
                .check(matches(isDisplayed()));
    }

    @Test
    public void onClickEight() {
        onView(withId(R.id.navigation_constraint)).perform(click());
        onView(withId(R.id.btn_eight)).perform(click());
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("You clicked the eighth button")))
                .check(matches(isDisplayed()));
    }

    @Test
    public void onClickNine() {
        onView(withId(R.id.navigation_constraint)).perform(click());
        onView(withId(R.id.btn_nine)).perform(click());
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText("You clicked the ninth button")))
                .check(matches(isDisplayed()));
    }
}