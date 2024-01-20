plugins {
    kotlin("jvm") version "1.9.23"
}

group = "learn.ktkatas.challenges"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val jUnitJupiterVersion: String by project

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-params:$jUnitJupiterVersion")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}