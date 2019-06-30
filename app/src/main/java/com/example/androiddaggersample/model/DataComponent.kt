package com.example.androiddaggersample.model

import com.example.androiddaggersample.ui.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [DataModule::class])
interface DataComponent : AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>() {}
}