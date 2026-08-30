plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.tlapala.d4n.complicaciones"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.tlapala.d4n.complicaciones"
        minSdk = 36
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    enableKotlin = false
}

dependencies {
}
