plugins {
    java
    id("fabric-loom") version "1.0-SNAPSHOT"
}

group = "net.stckoverflw"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.19.2")
    mappings("net.fabricmc:yarn:1.19.2+build.11")
    modImplementation("net.fabricmc:fabric-loader:0.14.9")
}