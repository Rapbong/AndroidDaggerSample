package com.example.androiddaggersample.di.repository

import com.example.androiddaggersample.repository.Feelight
import com.example.androiddaggersample.repository.Fly
import com.example.androiddaggersample.repository.FlyImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun feelight(feelight: Feelight): Fly

    @Binds
    abstract fun flyimpl(flyImpl: FlyImpl): Fly
}