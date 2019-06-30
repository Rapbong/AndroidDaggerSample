package com.example.androiddaggersample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androiddaggersample.R
import com.example.androiddaggersample.model.DataModel
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var dataModel: DataModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)

        Log.d("AndroidDaggerSample","MainActivity:: ${dataModel.onLoad()}")
    }
}
