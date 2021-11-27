package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.github.barteksc.pdfviewer.PDFView
import kotlinx.android.synthetic.main.activity_main6.*

class Main6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
         val pdf =findViewById(R.id.pdf) as PDFView
        pdf.fromAsset("pianopdf.pdf").load()
    }
}
