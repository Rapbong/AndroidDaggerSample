package com.example.androiddaggersample.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.androiddaggersample.TAG
import com.example.androiddaggersample.repository.data.GithubService
import com.example.androiddaggersample.repository.data.Repo
import javax.inject.Inject

class GithubRepository @Inject constructor(private val githubService: GithubService){
    internal fun search(keyword: String): LiveData<PagedList<Repo>> {
        Log.d(TAG, "GithubRepository:: search")

        val factory = RepoDataSourceFactory(githubService, keyword)
        val config = PagedList.Config.Builder()
            .setInitialLoadSizeHint(20)
            .setPageSize(10)
            .setPrefetchDistance(5)
            .setEnablePlaceholders(true).build()
        return LivePagedListBuilder(factory, config).build()
    }
}