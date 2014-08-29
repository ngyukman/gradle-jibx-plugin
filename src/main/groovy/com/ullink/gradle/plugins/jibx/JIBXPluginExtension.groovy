package com.ullink.gradle.plugins.jibx

import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.FileCollection
import org.gradle.util.Path

class JIBXPluginExtension {

    static final String DEFAULT_BINDING_DIR = 'bindings'

    def String rootAPIPath ='undefined';
    def String tempBuildFolderName = 'tmp';
    def List<String> bindingFiles = [];
    def File bindingDir
}