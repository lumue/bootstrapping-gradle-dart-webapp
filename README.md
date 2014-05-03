#gradle webapplication setup

###configure gradle build
apply war plugin
set war basename (optional)
```
war{
	baseName = 'webapp'
}
```

###add some webcontent
create src/main/webapp folder
create index.html

###run with jetty
apply jetty plugin
`gradle jettyRun`
access app at http://localhost:8080/webapp

##setup eclipse wtp facet
apply eclipse-wtp plugin
error: Java compiler level does not match the version of the installed Java project facet.	
solution: patch from updatesite http://download.eclipse.org/webtools/patches/drops/R3.5.2/P-3.5.2-20140329045715/repository