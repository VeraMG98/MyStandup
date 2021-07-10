package com.example.mystandupapp.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mystandupapp.R
import com.example.mystandupapp.ui.note.NoteActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: MainAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        loadData()
        setupListener()
    }

    private fun init() {
        adapter = MainAdapter()
        notes_list.adapter = adapter
    }

    private fun loadData() {
    }

    private fun setupListener() {
        btn_add_new_note.setOnClickListener {
            startActivity(Intent(this, NoteActivity :: class.java))
            finish()
        }
    }
}