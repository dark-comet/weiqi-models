plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

repositories {
    mavenCentral()
}

kotlin {
    jvm {
    }
    js {
        nodejs {}
        browser {}
    }
}