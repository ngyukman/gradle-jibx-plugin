package com.ullink.gradle.plugins.jibx

class JIBXPluginExtension {

    static final String DEFAULT_BINDING_DIR = 'bindings'
    static final String TEMP_TARGET_DIR = 'tmp'

    def String rootAPIPath = 'undefined'
    def List<String> bindingFiles = []
    def File bindingDir
    def File tempClassFolder
    def List<String> jibxTaskJvmArgs =[]
    def boolean verbose = false
    def boolean verify = false
    def boolean overrideErrors = false
    def boolean skipBindValidation = false
    def boolean trackBranches = false
    def boolean testLoading = false
}
