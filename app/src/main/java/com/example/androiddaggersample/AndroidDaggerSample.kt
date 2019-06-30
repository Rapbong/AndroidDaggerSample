package com.example.androiddaggersample

import android.app.Activity
import android.app.Application
import com.example.androiddaggersample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class AndroidDaggerSample : Application(), HasActivityInjector {
    @Inject
    lateinit var dispatchingAndroidInjector : DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    override fun onCreate() {
        DaggerAppComponent.create().inject(this)
        super.onCreate()
    }
}
