package com.example.androiddaggersample.repository

import android.util.Log
import com.example.androiddaggersample.TAG
import javax.inject.Inject

class Feelight @Inject constructor(): Fly {
    override fun onLoad() {
        Log.d(TAG, "Feelight:: onLoad")
    }
}