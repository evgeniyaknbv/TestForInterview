package com.alexandrovna.evgeniya.konobeeva.testforinterview.MediaBlock

import android.content.Context
import android.content.Intent
import java.net.URI

object MediaController{

    var service: MusicService? = null

    var listener : MediaControllerListener? = null

    fun play(uri: URI, context: Context){
        if(service?.isServiceStarted != true){
            val serviceIntent: Intent = Intent(context, MusicService.javaClass)
            context.startService(serviceIntent) // startForegroufd
//            service = context.bindService(serviceIntent, )
        }
    }

    fun stop(uri: URI){

    }

    fun pause(uri: URI){

    }

    fun reset(uri: URI){

    }

    private fun startMediaService(){

    }

    interface MediaControllerListener{
        fun onProgress(progress: Float)
    }

}