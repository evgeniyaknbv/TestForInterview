package com.alexandrovna.evgeniya.konobeeva.testforinterview.MediaBlock

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.IBinder.DeathRecipient
import android.os.IInterface
import android.os.Parcel
import android.util.Log
import java.io.FileDescriptor
import java.net.URI

class MusicService: Service() {

    companion object {
        val URI_TO_PLAY = "URI_TO_PLAY"
    }

    val TAG = "MusicService"

    public var isServiceStarted = false

    override fun onBind(intent: Intent?): IBinder? {
        return MusicBinder(this)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand: ");
        isServiceStarted = true
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        Log.d(TAG, "onCreate: ");
        super.onCreate()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: ");
        isServiceStarted = false
        super.onDestroy()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.d(TAG, "onUnbind: ");
        return super.onUnbind(intent)
    }

    fun play(uri: URI){
        Log.d(TAG, "play: ");
    }

    fun stop(uri: URI){
        Log.d(TAG, "stop: ");
    }

    fun pause(uri: URI){
        Log.d(TAG, "pause: ");
    }

    fun reset(uri: URI){
        Log.d(TAG, "reset: ");
    }

    private fun getUriFromIntent(intent: Intent?): URI?{
        var resultURI: URI? = null
        if(intent?.extras?.containsKey(URI_TO_PLAY) == true){
            val stringUri = intent.extras?.getString(URI_TO_PLAY)
            resultURI = stringUri?.let {  URI.create(it)}
        }

        return resultURI
    }
}