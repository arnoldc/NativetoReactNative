package com.example.myfirstapp
import com.facebook.react.ReactActivity
import android.os.Bundle
import android.util.Log

class ReactNativeActivity : ReactActivity() {
    override fun getMainComponentName(): String? {
        return "MyReactNativeApp"
    }
}