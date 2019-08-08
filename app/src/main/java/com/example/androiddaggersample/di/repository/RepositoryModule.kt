package com.example.androiddaggersample.di.repository

import androidx.paging.DataSource
import com.example.androiddaggersample.repository.RepoDataSource
import com.example.androiddaggersample.repository.data.GithubService
import com.example.androiddaggersample.repository.data.Repo
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideGithubService(gsonConverterFactory: GsonConverterFactory,
                             rxJava2CallAdapterFactory: RxJava2CallAdapterFactory)
            : GithubService {
        return Retrofit.
            Builder().baseUrl("https://api.github.com/")
            .client(provideHttpClient())
            .addConverterFactory(gsonConverterFactory)
            .addCallAdapterFactory(rxJava2CallAdapterFactory)
            .build()
            .create(GithubService::class.java)
    }

    @Singleton
    @Provides
    fun provideDataSource(githubService: GithubService): DataSource<Int, Repo> {
        return RepoDataSource(githubService)
    }

    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor())
            .build()
    }

    @Singleton
    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideRxjavaCallAdapterFactory(): RxJava2CallAdapterFactory {
        return RxJava2CallAdapterFactory.create()
    }
}