package com.example.androiddaggersample.di.ui

import androidx.databinding.DataBindingUtil
import com.example.androiddaggersample.R
import com.example.androiddaggersample.databinding.ActivityMainBinding
import com.example.androiddaggersample.ui.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    @ActivityScope
    fun provideMainActivityBinding(activity: MainActivity): ActivityMainBinding {
        return DataBindingUtil.setContentView(activity, R.layout.activity_main)
    }
}