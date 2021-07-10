package com.example.mystandupapp.domen

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteModel(
    @PrimaryKey(autoGenerate = true) var id : Long = 0,
    @ColumnInfo var txtYesterday : String?,
    @ColumnInfo var txtToday : String?,
    @ColumnInfo var txtProblems : String?,
    @ColumnInfo var txtDate : String?
)