package com.example.intellijplugin.actions.gradle

import com.example.intellijplugin.utils.runCommand
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction
import java.io.File

class GradleAction : DumbAwareAction("Gradle Action") {
    override fun actionPerformed(e: AnActionEvent) {
        val projectPath = e.project?.basePath ?: return
        "./gradlew tasks".runCommand(File(projectPath))
    }

}