package com.example.androiddaggersample.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.androiddaggersample.TAG
import com.example.androiddaggersample.repository.Car
import com.example.androiddaggersample.repository.Feelight
import com.example.androiddaggersample.repository.FlyImpl
import javax.inject.Inject

class MainViewModel @Inject constructor(): ViewModel() {
    @Inject
    lateinit var car: Car

    @Inject
    lateinit var feelight: Feelight

    @Inject
    lateinit var flyImpl: FlyImpl

    fun onClick() {
        Log.d(TAG, "MainViewModel:: onClick -> ${car.name}")
        feelight.onLoad()
        flyImpl.onLoad()
    }
}