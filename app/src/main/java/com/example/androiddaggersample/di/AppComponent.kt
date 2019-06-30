package com.example.androiddaggersample.di

import com.example.androiddaggersample.AndroidDaggerSample
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

@Component(modules = [AndroidInjectionModule::class, AppModule::class])
interface AppComponent {
    fun inject(application: AndroidDaggerSample)
}