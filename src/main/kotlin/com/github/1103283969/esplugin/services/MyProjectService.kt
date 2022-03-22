package com.github.1103283969.esplugin.services

import com.intellij.openapi.project.Project
import com.github.1103283969.esplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
