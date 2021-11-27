package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        imageButton5.setOnClickListener{
            var page3=Intent(this,Main2Activity::class.java)
            startActivity(page3)  }
        imageButton11.setOnClickListener{
            var page4=Intent(this,Main4Activity::class.java)
            startActivity(page4)  }
        imageButton9.setOnClickListener{
            var page5=Intent(this,Main5Activity::class.java)
            startActivity(page5)  }
        imageButton12.setOnClickListener{
            var page6=Intent(this,Main6Activity::class.java)
            startActivity(page6)  }
    }
}
