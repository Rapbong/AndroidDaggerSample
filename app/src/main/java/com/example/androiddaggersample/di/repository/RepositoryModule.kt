package com.example.androiddaggersample.di.repository

import com.example.androiddaggersample.repository.Heineken
import com.example.androiddaggersample.repository.Beer
import com.example.androiddaggersample.repository.Tsingtao
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun heineken(heineken: Heineken): Beer

    @Binds
    abstract fun tsingtao(tsingtao: Tsingtao): Beer
}