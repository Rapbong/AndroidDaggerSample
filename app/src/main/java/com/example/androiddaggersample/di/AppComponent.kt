package com.example.androiddaggersample.di

import com.example.androiddaggersample.AndroidDaggerSample
import com.example.androiddaggersample.di.repository.RepositoryModule
import com.example.androiddaggersample.di.ui.ActivityModule
import com.example.androiddaggersample.di.viewmodel.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityModule::class, ViewModelModule::class, RepositoryModule::class])
interface AppComponent : AndroidInjector<AndroidDaggerSample> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<AndroidDaggerSample>() {}
}