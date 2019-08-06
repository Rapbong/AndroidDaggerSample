package com.example.androiddaggersample.repository

import android.util.Log
import com.example.androiddaggersample.TAG
import com.example.androiddaggersample.repository.data.GithubService
import javax.inject.Inject

class GithubRepository @Inject constructor(private val githubService: GithubService){
    internal fun onload() {
        Log.d(TAG, "GithubRepository:: onload")
    }
}