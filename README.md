#gradle dart webapplication setup

##setup basic webapp 
https://github.com/lumue/bootstrapping-gradle-webapp/blob/master/README.md

##setup dart project

add 
```
pubspec.lock 
/packages/
```
to .gitignore
 
add web folder, some source files, pubspec.yaml


##eclipse
###install dart tools
###add dart project nature, builders with gradle
```
eclipse.project {
	natures 'org.springsource.ide.eclipse.gradle.core.nature','com.google.dart.tools.core.dartNature'
	buildCommand 'com.google.dart.tools.core.dartBuilder'
}
```
###run and debug in eclipse as dartium build

##run dart build with gradle


