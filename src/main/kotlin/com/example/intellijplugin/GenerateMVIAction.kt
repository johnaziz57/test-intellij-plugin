package com.example.intellijplugin

import com.example.intellijplugin.dialog.NameInputDialog
import com.example.intellijplugin.dialog.NameInputDialogListener
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction

class GenerateMVIAction : DumbAwareAction("MVI") {

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return

//        val dialog = NameInput();
//        dialog.pack()
//        dialog.isVisible = true
        NameInputDialog(project, object : NameInputDialogListener {
            override fun onOk(name: String) {
                TODO("Not yet implemented")
            }

            override fun onCancel() {
                TODO("Not yet implemented")
            }
        }).showAndGet()
//        Messages.showDialog("Hello", "Title", emptyArray(), 0, Messages.getInformationIcon())

    }

}