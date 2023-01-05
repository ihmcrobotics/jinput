plugins {
   id("us.ihmc.ihmc-build")
}

ihmc {
   group = "us.ihmc"
   version = "2.0.6-ihmc2"
   vcsUrl = "https://github.com/ihmcrobotics/jinput"
   openSource = true

   configureDependencyResolution()
   javaDirectory("main", "../../applet/src")
   javaDirectory("main", "../../coreAPI/src/java")
   javaDirectory("main", "../../plugins/awt/src")
   javaDirectory("main", "../../plugins/linux/src/java")
   javaDirectory("main", "../../plugins/OSX/src/java")
   javaDirectory("main", "../../plugins/windows/src/java")
   javaDirectory("main", "../../plugins/wintab/src/java")
   configurePublications()
}

mainDependencies {
   api("net.java.jutils:jutils:1.0.0")
   api("org.apache.commons:commons-lang3:3.12.0")
   api("us.ihmc:ihmc-native-library-loader:2.0.2")
   api("net.java.jinput:jinput-platform:2.0.6:natives-windows")
   api("net.java.jinput:jinput-platform:2.0.6:natives-osx")
   api("net.java.jinput:jinput-platform:2.0.6:natives-linux")
}
