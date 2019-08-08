package com.example.androiddaggersample.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.androiddaggersample.TAG
import com.example.androiddaggersample.repository.data.GithubService
import com.example.androiddaggersample.repository.data.Repo
import com.example.androiddaggersample.repository.data.RepoSearchResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class GithubRepository @Inject constructor(private val githubService: GithubService){
    internal fun onload() : LiveData<PagedList<Repo>> {
        Log.d(TAG, "GithubRepository:: onload")

        val factory = RepoDataSourceFactory(githubService)
        val config = PagedList.Config.Builder()
            .setInitialLoadSizeHint(20)
            .setPageSize(10)
            .setPrefetchDistance(5)
            .setEnablePlaceholders(true).build()
        return LivePagedListBuilder(factory, config).build()
    }

    private fun convertData(response: RepoSearchResponse) {

    }
}