package com.example.androiddaggersample.model

import android.content.Context
import android.util.Log
import javax.inject.Inject

class DataModelImpl : DataModel {
    override fun onLoad(): Boolean {
        Log.d("AndroidDaggerSample", "DataModelimpl:: onLoad")
        return true
    }
}