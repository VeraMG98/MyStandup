package com.example.mystandupapp.domen.date

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("SimpleDateFormat")
fun getCurrentDate() : String {
    val simpleDateFormat = SimpleDateFormat("dd MM yyyy")
    return simpleDateFormat.format(Date())
}