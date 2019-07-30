package com.example.androiddaggersample.repository

import android.util.Log
import com.example.androiddaggersample.TAG
import javax.inject.Inject

class FlyImpl @Inject constructor() : Fly {
    override fun onLoad() {
        Log.d(TAG, "FlyImpl onLoad..")
    }
}