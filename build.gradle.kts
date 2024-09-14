plugins {
    java
    kotlin("jvm") version "2.0.0"
    id("org.openjfx.javafxplugin") version "0.1.0"
    application
}

group = "be.webtechie"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

javafx {
    version = "21.0.2"
    modules("javafx.controls")
}

application {
    mainClass.set("be.webtechie.MainKotlin")
}