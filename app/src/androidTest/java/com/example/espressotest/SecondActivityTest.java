package com.example.espressotest;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;

public class SecondActivityTest {

    @Rule
    public ActivityTestRule<SecondActivity> mActivityRule = new ActivityTestRule<>(SecondActivity.class);


}