package com.example.androiddaggersample.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.androiddaggersample.TAG
import com.example.androiddaggersample.repository.Car
import com.example.androiddaggersample.repository.Heineken
import com.example.androiddaggersample.repository.Tsingtao
import javax.inject.Inject

class MainViewModel @Inject constructor(): ViewModel() {
    @Inject
    lateinit var car: Car

    @Inject
    lateinit var heineken: Heineken

    @Inject
    lateinit var tsingtao: Tsingtao

    fun onClick() {
        Log.d(TAG, "MainViewModel:: onClick -> ${car.name}")
        heineken.onLoad()
        tsingtao.onLoad()
    }
}