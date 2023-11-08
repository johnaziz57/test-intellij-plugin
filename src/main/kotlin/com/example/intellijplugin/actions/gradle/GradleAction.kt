package com.example.intellijplugin.actions.gradle

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

class GradleAction : DumbAwareAction("Gradle Action") {
    override fun actionPerformed(e: AnActionEvent) {
//        test()
//        val projectPath = e.project?.basePath ?: return
//        val connector = GradleConnector.newConnector()
//        connector.forProjectDirectory(File(projectPath))

//        application.executeOnPooledThread {
//            val connection = connector
//                .useBuildDistribution()
//                .connect()
//            try {
//                val gradleProject = connection.getModel(GradleProject::class.java)
//                gradleProject.tasks.forEach{ println(it) }
////            val resultHandler = object : ResultHandler<Void> {
////                override fun onComplete(result: Void?) {
////                    println("complete")
////                    println(result)
////                }
////
////                override fun onFailure(failure: GradleConnectionException?) {
////                    println("failure: ${failure?.localizedMessage}")
////                }
////
////            }
////            connection.newBuild()
////                .forTasks("iDD")
////                .setStandardOutput(System.out)
////                .setJavaHome(File("/Users/john/Library/Java/JavaVirtualMachines/corretto-11.0.21/Contents/Home"))
////                .run(resultHandler)
//
//
//            } catch (e: Exception) {
//                println("SOMETHING WRONG: ${e.localizedMessage}")
//            } finally {
//                connection.close()
//            }
//        }
    }


    private fun testInternetConnection() {
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