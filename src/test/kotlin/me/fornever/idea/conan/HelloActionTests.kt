package me.fornever.idea.conan

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import com.intellij.testFramework.LightPlatformTestCase
import com.intellij.testFramework.TestDataProvider
import org.junit.Assert

class HelloActionTests : LightPlatformTestCase() {

    fun testActionShouldBePerformedWithoutAnyError() {
        var message: String? = null
        Messages.setTestDialog({ message = it; 0 })

        val context = TestDataProvider(ourProject)
        val event = AnActionEvent.createFromDataContext("", null, context)

        val action = HelloAction()
        action.actionPerformed(event)

        Assert.assertEquals("Hello world!", message)
    }
}
