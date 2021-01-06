package com.github.vanjakovacevicoptima.plugintest.services

import com.intellij.openapi.project.Project
import com.github.vanjakovacevicoptima.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
