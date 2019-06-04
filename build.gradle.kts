plugins {
    kotlin("jvm") version "1.3.31"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testImplementation("org.assertj:assertj-core:3.11.1")

    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.5")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.5")
    testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.3.31")
}

tasks.test {
    useJUnitPlatform {
        includeEngines("spek2")
    }
}
