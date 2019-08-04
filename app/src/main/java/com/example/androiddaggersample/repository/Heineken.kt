package com.example.androiddaggersample.repository

import android.util.Log
import com.example.androiddaggersample.TAG
import javax.inject.Inject

class Heineken @Inject constructor(): Beer {
    override fun onLoad() {
        Log.d(TAG, "Heineken:: onLoad")
    }
}