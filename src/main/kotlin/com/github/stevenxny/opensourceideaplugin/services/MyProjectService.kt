package com.github.stevenxny.opensourceideaplugin.services

import com.github.stevenxny.opensourceideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
