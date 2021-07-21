package com.github.ziscloud.plantumltextgenerator.services

import com.github.ziscloud.plantumltextgenerator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
