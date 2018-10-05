package com.alexandrovna.evgeniya.konobeeva.testforinterview.UI

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.alexandrovna.evgeniya.konobeeva.testforinterview.MediaBlock.MediaController
import com.alexandrovna.evgeniya.konobeeva.testforinterview.MediaBlock.MediaController.MediaControllerListener
import com.alexandrovna.evgeniya.konobeeva.testforinterview.R.layout
import com.alexandrovna.evgeniya.konobeeva.testforinterview.UI.MusicAdapter.MusicListener
import kotlinx.android.synthetic.main.activity_main.activity_main_recycler
import java.net.URI

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        initRecyclerView()
        initMediaControllerListener()
    }


    private fun initRecyclerView(){
        val adapter = MusicAdapter(getMusicList(),
                object : MusicListener {
                    override fun playPressed(uri: URI) {
                        MediaController.play(uri)
                    }

                    override fun stopPressed(uri: URI) {
                        MediaController.stop(uri)
                    }

                    override fun pausePressed(uri: URI) {
                        MediaController.pause(uri)
                    }

                    override fun resetPressed(uri: URI) {
                        MediaController.reset(uri)
                    }
                })
        activity_main_recycler.adapter = adapter
        activity_main_recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    private fun getMusicList(): List<MusicModel>{
        return listOf(MusicModel("name", URI.create("")),
                MusicModel("name0", URI.create("")),
                MusicModel("name1", URI.create("")),
                MusicModel("name3", URI.create("")),
                MusicModel("name4", URI.create("")),
                MusicModel("name5", URI.create("")),
                MusicModel("name6", URI.create("")))
    }

    private fun initMediaControllerListener(){
        MediaController.listener = object : MediaControllerListener {
            override fun onProgress(progress: Float) {
                Log.d(TAG, "onProgress: progress = $progress");
            }
        }
    }

}
