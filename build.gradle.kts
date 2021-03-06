// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    rootProject.extra["kotlinVersion"] = "1.4.32"
    val kotlinVersion = rootProject.extra["kotlinVersion"] as String

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Android gradle plugin.
        classpath("com.android.tools.build:gradle:4.2.0")
        // Kotlin gradle plugin.
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
