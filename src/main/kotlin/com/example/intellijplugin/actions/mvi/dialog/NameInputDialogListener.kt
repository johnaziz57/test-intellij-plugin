package com.example.intellijplugin.actions.mvi

interface NameInputDialogListener {
    fun onOk(name: String)

    fun onCancel()
}