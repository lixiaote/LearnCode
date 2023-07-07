package com.talon.versionplugin

/**
 * @Description:
 * @author: talon
 * @date: 2023年06月30日 11:36
 */

object BuildVersions {
    const val compileSdk = 31
    const val buildTools = "30.0.2"
    const val minSdk = 21
    const val targetSdk = 31
    const val versionCode = 1
    const val versionName = "1.0"
}



object Versions {
    const val appcompat = "1.2.0"
    const val material = "1.3.0"
    const val constraintlayout = "2.0.4"
    const val livedata_ktx = "2.4.1"
    const val viewmodel_ktx = "2.4.1"
    const val navigation_fragment_ktx = "2.4.2"
    const val navigation_ui_ktx = "2.4.2"
    const val kotlinx_coroutines_core = "1.6.4"
    const val kotlinx_coroutines_android = "1.6.4"
    const val recyclerview = "1.0.0"
    const val smartfreshlayout = "2.0.6"

}

object Deps{
    const val appcompat =  "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material =  "com.google.android.material:material:${Versions.material}"
    const val constraintlayout =  "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val livedata_ktx =  "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.livedata_ktx}"
    const val viewmodel_ktx =  "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewmodel_ktx}"
    const val navigation_fragment_ktx =  "androidx.navigation:navigation-fragment-ktx:${Versions.navigation_fragment_ktx}"
    const val navigation_ui_ktx =  "androidx.navigation:navigation-ui-ktx:${Versions.navigation_ui_ktx}"
    const val kotlinx_coroutines_core =  "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinx_coroutines_core}"
    const val kotlinx_coroutines_android =  "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinx_coroutines_android}"
    const val recyclerview =  "androidx.recyclerview:recyclerview:${Versions.recyclerview}"


}

