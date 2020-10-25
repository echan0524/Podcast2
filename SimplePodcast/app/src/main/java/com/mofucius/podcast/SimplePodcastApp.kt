package com.mofucius.podcast

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SimplePodcastApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}