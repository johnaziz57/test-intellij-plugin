package com.example.intellijplugin.dialog

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.JComponent
import javax.swing.JPanel
import javax.swing.JTextField

class NameInputDialog(
    project: Project,
    private val listener: NameInputDialogListener,
) : DialogWrapper(project) {

    var mviNameField: JTextField? = null
    var contentPanel: JPanel? = null

    init {
        init()
        title = "MVI name"
    }

    override fun doOKAction() {
        super.doOKAction()
        listener.onOk(mviNameField?.text ?: "failed")
    }

    override fun doCancelAction() {
        super.doCancelAction()
        listener.onCancel()
    }

    override fun createCenterPanel(): JComponent? {
        return contentPanel
    }

}