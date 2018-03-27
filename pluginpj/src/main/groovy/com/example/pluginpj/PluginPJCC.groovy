package com.example.pluginpj

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by ex-zhoulai on 2018/3/27.
 *
 */
class PluginPJCC implements Plugin<Project> {


    @Override
    void apply(Project project) {
        println "PluginPJ"
        println project.properties.get("version")
        println project.properties.get("project_name")
    }
}
