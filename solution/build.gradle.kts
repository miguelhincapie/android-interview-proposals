plugins {
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("javax.inject:javax.inject:1")
    implementation("com.google.dagger:dagger:2.44")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}