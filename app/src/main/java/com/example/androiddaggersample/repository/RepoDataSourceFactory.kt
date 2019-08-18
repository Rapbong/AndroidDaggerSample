package com.example.androiddaggersample.repository

import androidx.paging.DataSource
import com.example.androiddaggersample.repository.data.GithubService
import com.example.androiddaggersample.repository.data.Repo

class RepoDataSourceFactory (private val githubService: GithubService, private val keyword: String): DataSource.Factory<Int, Repo>() {
    override fun create(): DataSource<Int, Repo> {
        return RepoDataSource(githubService, keyword)
    }
}