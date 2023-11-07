package com.example.intellijplugin.actions.mvi

import com.example.intellijplugin.dialog.NameInputDialog
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.project.DumbAwareAction
import java.io.File

class GenerateMVIAction : DumbAwareAction("MVI") {

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        NameInputDialog(project, object : NameInputDialogListener {
            override fun onOk(name: String) {
                val path = e.getData(CommonDataKeys.VIRTUAL_FILE)?.path
                val file = File("$path/morteza.txt")
                file.createNewFile()
                file.writeText("HELLO MORTEZA, I AM A PLUGIN")
            }

            override fun onCancel() {
                println("NAAAAHHHHH")
            }
        }).showAndGet()
    }
}