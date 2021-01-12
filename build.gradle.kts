plugins {
    id("org.jetbrains.kotlin.jvm") version ("1.4.10")
}

group = "com.reactor.reactorbasic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("io.projectreactor:reactor-core:3.4.0")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.1.2")
}