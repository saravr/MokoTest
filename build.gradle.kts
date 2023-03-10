plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
    id("com.android.application") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
}

buildscript {
    dependencies {
        classpath("dev.icerock.moko:resources-generator:0.20.1")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
