package com.example.androiddaggersample.model

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    fun provideDataModule() : DataModel {
        return DataModelImpl()
    }
}