package com.example.androiddaggersample.repository.data

import com.google.gson.annotations.SerializedName

data class RepoSearchResponse(
    @SerializedName("total_count")
    val totalCount: Int = 0,

    @SerializedName("items")
    val items: List<Repo> = emptyList()
)