package com.example.intellijplugin

import com.example.intellijplugin.dialog.NameInputDialog
import com.example.intellijplugin.dialog.NameInputDialogListener
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction

class GenerateMVIAction : DumbAwareAction("MVI") {

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        NameInputDialog(project, object : NameInputDialogListener {
            override fun onOk(name: String) {
                println("YEAHHHHHH $name")
            }

            override fun onCancel() {
                println("NAAAAHHHHH")
            }
        }).showAndGet()
    }
}