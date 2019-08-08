package com.example.androiddaggersample.repository

import androidx.paging.DataSource
import com.example.androiddaggersample.repository.data.GithubService
import com.example.androiddaggersample.repository.data.Repo
import javax.inject.Inject

class RepoDataSourceFactory @Inject constructor(private val githubService: GithubService): DataSource.Factory<Int, Repo>() {
    override fun create(): DataSource<Int, Repo> {
        return RepoDataSource(githubService)
    }
}