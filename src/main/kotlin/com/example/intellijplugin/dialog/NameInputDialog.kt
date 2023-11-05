package com.example.intellijplugin.dialog

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.JComponent

class NameInputDialog(
    private val project: Project,
    private val listener: NameInputDialogListener,
) : DialogWrapper(project) {

    init {
        init()
        title = "MVI name"
    }

    override fun createCenterPanel(): JComponent? {
        TODO("Not yet implemented")
    }

}