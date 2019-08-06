package com.example.androiddaggersample.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.androiddaggersample.TAG
import com.example.androiddaggersample.repository.GithubRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: GithubRepository): ViewModel() {

    fun onClick() {
        Log.d(TAG, "MainViewModel:: onClick")
        repository.onload()
    }
}