plugins {
    id("java")
}

dependencies {
    implementation(libs.utility.lombok)
    implementation(libs.jetbrains.annotations)
    implementation(libs.netty5.all)
    implementation(libs.gson)
    implementation(project(":netty5-connection"))
    annotationProcessor(libs.utility.lombok)
}