plugins {
    kotlin("jvm")
    application
}

group = "org.cramacug"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    // https://mvnrepository.com/artifact/org.apache.pulsar/pulsar-client
    implementation("org.apache.pulsar:pulsar-client:2.10.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}