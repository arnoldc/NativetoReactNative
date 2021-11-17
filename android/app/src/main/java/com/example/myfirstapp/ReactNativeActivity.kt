package com.example.myfirstapp

import com.facebook.react.ReactActivity


class ReactNativeActivity : ReactActivity() {
    override fun getMainComponentName(): String? {
        return "MyReactNativeApp"
    }
}