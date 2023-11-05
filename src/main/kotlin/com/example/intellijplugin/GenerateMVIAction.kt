package com.example.intellijplugin

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.ui.Messages

class GenerateMVIAction : DumbAwareAction("MVI") {

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return

        val dialogue = NameInput();
        Messages.showDialog("Hello", "Title", emptyArray(), 0, Messages.getInformationIcon())

    }

}