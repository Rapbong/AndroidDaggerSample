package com.example.androiddaggersample.repository.data

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {
    @GET("search/repositories?sort=stars")
    fun searchRepos(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") itemsPerPage: Int
    ): Single<RepoSearchResponse>
}