package com.example.kotlinprobs

import android.app.Activity
import android.os.Bundle
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.runner.AndroidJUnit4
import android.support.test.rule.ActivityTestRule
import android.view.ViewGroup
import android.widget.EditText
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var mActivityRule = ActivityTestRule<FooTestActivity>(FooTestActivity::class.java)

    @Test
    fun useAppContext() {
        onView(withId(8000)).perform(typeText("abc"))
    }
}

class FooTestActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addContentView(EditText(this).apply { id = 8000 }, ViewGroup.LayoutParams(700, 700))
    }
}
