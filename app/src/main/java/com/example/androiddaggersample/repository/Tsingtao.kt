package com.example.androiddaggersample.repository

import android.util.Log
import com.example.androiddaggersample.TAG
import javax.inject.Inject

class Tsingtao @Inject constructor() : Beer {
    override fun onLoad() {
        Log.d(TAG, "Tsingtao onLoad..")
    }
}