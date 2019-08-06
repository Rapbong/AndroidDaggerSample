package com.example.androiddaggersample.repository.data

import com.google.gson.annotations.SerializedName

data class Repo (
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("full_name") val full_name: String,
    @SerializedName("description") val description: String,
    @SerializedName("stargazers_count") val starCount: Int,
    @SerializedName("language") val language: String
)