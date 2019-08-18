package com.example.androiddaggersample.repository

import androidx.paging.PageKeyedDataSource
import com.example.androiddaggersample.repository.data.GithubService
import com.example.androiddaggersample.repository.data.Repo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RepoDataSource (private val githubService: GithubService, private val keyword: String) : PageKeyedDataSource<Int, Repo>() {
    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, Repo>) {
        val currentPage = 1
        val nextpage = currentPage + 1

        githubService.searchRepos(keyword, 1, 10)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map {it.items}
            .subscribe() {callback.onResult(it, null, nextpage)}
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Repo>) {
        //ignore..
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Repo>) {
        val nextPage = params.key + 1

        githubService.searchRepos(keyword, params.key, 10)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map {it.items}
            .subscribe() {callback.onResult(it, nextPage)}
    }
}