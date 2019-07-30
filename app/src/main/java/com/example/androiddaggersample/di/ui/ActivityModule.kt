package com.example.androiddaggersample.di.ui

import com.example.androiddaggersample.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun getMainActivity() : MainActivity
}