Modules
=========================
The main parts of the project are:

* canvas-core: Java bundle containing all core functionality like OSGi services, listeners or schedulers, as well as component-related Java code such as servlets or request filters.
* canvas-ui: contains the /apps (and /etc) parts of the project, ie JS&CSS clientlibs, components, templates, runmode specific configs as well as Hobbes-tests
* canvas-content: contains demo content using the components from the canvas-ui

Maven settings (skip this step if you are familiar with Maven for building AEM projects)
=========================

The project comes with the auto-public repository configured. To setup the repository in your Maven settings, refer to:
http://helpx.adobe.com/experience-manager/kb/SetUpTheAdobeMavenRepository.html

How To Build
=========================

To build all the modules run in the project root directory the following command with Maven:

    mvn clean install

If you have a running AEM Author instance you can build and package the whole project and deploy into AEM with

    mvn clean install -PautoInstallPackage  -PautoInstallContentPackage

Note :
-PautoInstallPackage : this profile to build and deploy all AEM source code (component, template, OSGi and etc)
-PautoInstallContentPackage : this profile to build and deploy demo content page (under /content/canvas)

Or to deploy it to a AEM Publish instance, run

    mvn clean install -PautoInstallPackagePublish
    
Or to deploy only the OSGi bundle to the author, run

    mvn clean install -PautoInstallBundle

Testing
=========================

There are two levels of testing (Java Unit Test & Client-Side UI Test) contained in the project:

* unit test in core: this show-cases classic unit testing of the code contained in the bundle. To test, execute:

    mvn clean test

* client-side Hobbes.js tests: JavaScript-based browser-side tests that verify browser-side behavior. To test:

    in the browser, open the page in 'Developer mode', open the left panel and switch to the 'Tests' tab and find the generated 'MyName Tests' and run them.

