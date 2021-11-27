package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      // val filename= "VID_20181228_092808"
        val fileplace="android.resource://"+packageName+"/raw/"+R.raw.samphony
        val videoView=findViewById<View>(R.id.videoView) as VideoView
videoView.setVideoURI(Uri.parse(fileplace))
        videoView.setMediaController(MediaController( this))
    videoView.start()
        button.setOnClickListener{
    var page2=Intent(this,Main3Activity::class.java)
    startActivity(page2)  }
    }
}
