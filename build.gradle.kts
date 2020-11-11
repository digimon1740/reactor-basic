plugins {
    id("org.jetbrains.kotlin.jvm") version ("1.4.10")
}

group = "com.webflux.reactorbasic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("io.projectreactor:reactor-core:3.4.0")
}