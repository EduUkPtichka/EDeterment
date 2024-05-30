plugins {
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    //alias(libs.plugins.google.ksp).apply(false)

    alias(libs.plugins.jetbrains.kotlinAndroid).apply(false)
    alias(libs.plugins.jetbrains.kotlinMultiplatform).apply(false)
    alias(libs.plugins.jetbrains.composeMultiplatform).apply(false)
    alias(libs.plugins.jetbrains.kotlinCocoapods).apply(false)
    alias(libs.plugins.jetbrains.kotlinPluginSerialization).apply(false)

    alias(libs.plugins.icerock.mokoMobileMultiplatformResources).apply(false)
    //alias(libs.plugins.touchlab.skiePlugin).apply(false)
}

buildscript {
    dependencies {
        classpath(libs.moko.resourcesGenerator)
    }
}