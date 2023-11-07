package com.example.intellijplugin.actions.gradle

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class GradleAction : AnAction("Gradle Action") {
    override fun actionPerformed(e: AnActionEvent) {
        println("Hello")
    }
}