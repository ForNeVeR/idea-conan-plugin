idea-conan-plugin [![Build Status (Appveyor)][status-appveyor]][build-appveyor] [![Build Status (Travis)][status-travis]][build-travis]
=================

This is a project to build [IndelliJ IDEA][idea]-compatible plugin for
[Conan][conan], C/C++ package manager.

Build
-----

This project uses [Gradle][gradle] build system. The only build prerequisite is
a valid Java Development Kit installation.

To build the project, use the following command:

```console
$ ./gradlew build
```

[build-appveyor]: https://ci.appveyor.com/project/ForNeVeR/idea-conan-plugin/branch/master
[build-travis]:https://travis-ci.org/ForNeVeR/idea-conan-plugin
[conan]: https://www.conan.io/
[gradle]: https://gradle.org/
[idea]: https://www.jetbrains.com/idea/

[status-appveyor]: https://ci.appveyor.com/api/projects/status/wvde1q5q8wx6mx4v/branch/master?svg=true
[status-travis]: https://travis-ci.org/ForNeVeR/idea-conan-plugin.svg?branch=master
