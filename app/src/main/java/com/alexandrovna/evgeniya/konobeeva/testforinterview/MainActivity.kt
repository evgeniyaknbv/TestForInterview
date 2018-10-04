package com.alexandrovna.evgeniya.konobeeva.testforinterview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_audio_play)
        Log.d(TAG, "onCreate: ");
    }

}
