package com.example.intellijplugin.dialog

interface NameInputDialogListener {
    fun onOk(name: String)

    fun onCancel()
}