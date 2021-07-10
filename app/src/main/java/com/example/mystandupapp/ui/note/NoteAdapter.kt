package com.example.mystandupapp.ui.note

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class NoteAdapter(activity: AppCompatActivity, private val itemCount: Int) :
    FragmentStateAdapter(activity) {
    override fun getItemCount() = itemCount

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> NoteFragment(position)
            1 -> NoteFragment(position)
            2 -> NoteFragment(position)
            else -> Fragment()
        }
    }
}