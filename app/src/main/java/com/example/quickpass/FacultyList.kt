package com.example.quickpass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_faculty_list.*

class FacultyList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculty_list)

        btn_snd_application_fnl.setOnClickListener {
            startActivity(Intent(this, ApplicationAccepted::class.java))
            finish()
        }
    }
}