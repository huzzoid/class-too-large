package com.example.myapplication

import RootScreen
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.kaspersky.components.kautomator.component.common.views.UiView
import com.kaspersky.components.kautomator.component.scroll.UiScrollView
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest : TestCase() {
    @Test
    fun scroll() {
        ActivityScenario.launch(MainActivity::class.java).use {
            RootScreen {
                UiScrollView { withId(rootId) }.scrollToView(
                    UiView {
                        withId(lastChildId)
                    }
                )
                UiView { withText(lastChildText) }.isDisplayed()
                UiView { withText(lastChildText2) }.isDisplayed()
            }
        }
    }
}
