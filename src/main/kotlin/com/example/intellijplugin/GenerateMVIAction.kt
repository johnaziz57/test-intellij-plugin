package com.example.intellijplugin

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction

class GenerateMVIAction : DumbAwareAction("MVI") {

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return

        val dialog = NameInput();
        dialog.pack()
        dialog.isVisible = true
//        Messages.showDialog("Hello", "Title", emptyArray(), 0, Messages.getInformationIcon())

    }

}