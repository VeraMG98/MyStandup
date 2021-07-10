package com.example.mystandupapp.ui.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.example.mystandupapp.R
import com.example.mystandupapp.domen.date.getCurrentDate
import kotlinx.android.synthetic.main.fragment_yesterday.*

class NoteFragment(var pos: Int) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_yesterday, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        when (pos) {
            0 -> {
                setFragmentElements(context?.resources?.getString(R.string.yesterday).toString(), left = false, right = true )
            }
            1 -> {
                setFragmentElements(context?.resources?.getString(R.string.today).toString(), left = true, right = true )
            }
            2 -> {
                setFragmentElements(context?.resources?.getString(R.string.problems).toString(), left = true, right = false )
            }
        }
    }

    private fun setFragmentElements(string: String, left: Boolean, right: Boolean) {
        txt_date.text = getCurrentDate()
        txt_title.text = string
        ic_left_page.isVisible = left
        ic_right_page.isVisible = right
    }

}