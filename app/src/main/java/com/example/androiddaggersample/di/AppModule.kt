package com.example.androiddaggersample.di

import android.app.Activity
import com.example.androiddaggersample.model.DataComponent
import com.example.androiddaggersample.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = [DataComponent::class])
abstract class AppModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivity(builder: DataComponent.Builder) : AndroidInjector.Factory<out Activity>
}
