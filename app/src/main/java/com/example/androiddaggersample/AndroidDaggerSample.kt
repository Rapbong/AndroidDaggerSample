package com.example.androiddaggersample

import android.util.Log
import com.example.androiddaggersample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

val TAG = "AndroidDaggerSample"

class AndroidDaggerSample : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Application onCreate")
    }
}