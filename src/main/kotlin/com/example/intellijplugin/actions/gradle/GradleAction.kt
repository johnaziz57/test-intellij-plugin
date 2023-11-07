package com.example.intellijplugin.actions.gradle

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction
import org.gradle.tooling.GradleConnectionException
import org.gradle.tooling.GradleConnector
import org.gradle.tooling.ResultHandler
import java.io.File
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

class GradleAction : DumbAwareAction("Gradle Action") {
    override fun actionPerformed(e: AnActionEvent) {
        test()
        val projectPath = e.project?.basePath ?: return
        val connector = GradleConnector.newConnector()
        connector.forProjectDirectory(File(projectPath))
        val connection = connector.connect()
        try {
            val resultHandler = object : ResultHandler<Void> {
                override fun onComplete(result: Void?) {
                    println("complete")
                    println(result)
                }

                override fun onFailure(failure: GradleConnectionException?) {
                    println("failure: ${failure?.localizedMessage}")
                }

            }
            connection.newBuild()
                .forTasks("iDD")
                .setStandardOutput(System.out)
                .run(resultHandler)


        } catch (e: Exception) {
            println("SOMETHING WRONG")
        } finally {
            connection.close()
        }
    }


    private fun test() {
        try {
            val url = URL("https://www.google.com")
            val urlConn = url.openConnection() as HttpURLConnection
            urlConn.connect()
            if (urlConn.responseCode == 200) {
                println("Connected to internet.")
            } else {
                println("Could not connect to internet.")
            }
            urlConn.disconnect()
        } catch (e: IOException) {
            println("Could not connect to internet: " + e.message)
        }
    }

}