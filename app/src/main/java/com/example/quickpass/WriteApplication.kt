package com.example.quickpass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_write_application.*

class WriteApplication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write_application)


        btn_snd_application.setOnClickListener{
            startActivity(Intent(this, FacultyList::class.java))
        }
    }
}