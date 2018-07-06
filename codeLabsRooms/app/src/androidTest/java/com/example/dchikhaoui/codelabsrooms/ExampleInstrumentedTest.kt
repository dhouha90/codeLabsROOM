package com.example.dchikhaoui.codelabsrooms

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented MainActivity, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under MainActivity.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.dchikhaoui.codelabsrooms", appContext.packageName)
    }
}
