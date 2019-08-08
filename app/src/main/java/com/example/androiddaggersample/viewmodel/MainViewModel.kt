package com.example.androiddaggersample.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.androiddaggersample.TAG
import com.example.androiddaggersample.repository.GithubRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: GithubRepository): ViewModel() {

    private val repoLiveData = MutableLiveData<String>()
    val searchLiveData = Transformations.switchMap(repoLiveData) {
        repository.onload()
    }

    fun onClick() {
        Log.d(TAG, "MainViewModel:: onClick")
        repoLiveData.postValue("android")
    }
}