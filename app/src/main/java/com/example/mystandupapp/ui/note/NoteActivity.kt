package com.example.mystandupapp.ui.note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mystandupapp.R
import com.example.mystandupapp.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_new_note.*
import kotlinx.android.synthetic.main.fragment_yesterday.*

class NoteActivity : AppCompatActivity() {
    private val adapter = NoteAdapter(this, 3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_note)
        init()
        setListener()
    }

    private fun init() {
        container.adapter = adapter
    }

    private fun setListener() {
        ic_back_main.setOnClickListener {
            startActivity(Intent(this, MainActivity :: class.java))
            finish()
        }
        ic_share.setOnClickListener {  }
        ic_calendar.setOnClickListener {  }
        ic_ok.setOnClickListener {
            save()
        }
    }

    private fun save() {
    }



}