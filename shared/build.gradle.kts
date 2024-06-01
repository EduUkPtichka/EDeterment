plugins {
    alias(libs.plugins.androidLibrary)
    //alias(libs.plugins.google.ksp)

    alias(libs.plugins.jetbrains.kotlinMultiplatform)
    alias(libs.plugins.jetbrains.composeMultiplatform)
    alias(libs.plugins.jetbrains.kotlinCocoapods)
    alias(libs.plugins.jetbrains.kotlinPluginSerialization)
    alias(libs.plugins.touchlab.skiePlugin)

    alias(libs.plugins.icerock.mokoMobileMultiplatformResources)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"

            }
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()
    
    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "15.0"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
            //isStatic = true

            export(libs.arkivanov.decompose)
            export(libs.arkivanov.essenty.lifecycle)
            export(libs.arkivanov.essenty.stateKeeper)

            export(libs.moko.resources)
            export(libs.moko.graphics)


            //xcodeConfigurationToNativeBuildType["CUSTOM_DEBUG"] = NativeBuildType.DEBUG
            //xcodeConfigurationToNativeBuildType["CUSTOM_RELEASE"] = NativeBuildType.RELEASE

        }
    }

}

dependencies {

    // Compose multiplatform
    commonMainImplementation(libs.jetbrains.composeRuntime)
    commonMainImplementation(libs.jetbrains.composeFoundation)
    commonMainImplementation(libs.jetbrains.composeMaterial3)
    commonMainImplementation(libs.jetbrains.composeMaterial)
    commonMainImplementation(libs.jetbrains.composeUi)

    // Compose Lib
    commonMainImplementation(libs.chrisbanes.hazeJetpackCompose)

    // Jetbrains
    commonMainImplementation(libs.jetbrains.kotlinxCollectionsImmutable)
    commonMainImplementation(libs.jetbrains.kotlinx.serialization.json)

    // Jetbrains Ktor-Client
    commonMainImplementation(libs.ktor.client.core)

    // Decompose
    commonMainApi(libs.arkivanov.decompose)
    commonMainApi(libs.arkivanov.decompose.extensionsCompose)

    // MVI
    commonMainApi(libs.arkivanov.mvikotlin)
    commonMainApi(libs.arkivanov.mvikotlinMain)
    commonMainApi(libs.arkivanov.mvikotlinExtensionsCoroutines)
    commonMainApi(libs.arkivanov.mvikotlinLogger)
    commonMainApi(libs.arkivanov.mvikotlinTimetravel)

    commonMainImplementation(libs.kodein.di)

    // Moko
    commonMainApi(libs.moko.resources)
    commonMainApi(libs.moko.resourcesCompose)

    /* ----------------- Android ----------------- */

    "androidMainImplementation"(libs.android.composeUiToolingPreview)
}

android {
    namespace = "determent.der.shared"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.version.get()
    }

    buildFeatures {
        compose = true
    }

    dependencies {
        debugImplementation(libs.android.composeUiTooling)
    }

}

multiplatformResources {
    resourcesPackage.set("org.example.library")
}