package com.example.mystandupapp.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mystandupapp.R
import com.example.mystandupapp.domen.NoteModel
import kotlinx.android.synthetic.main.item_note.view.*

class MainAdapter() : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    private var items : MutableList<NoteModel> = ArrayList()
    private var context : Context? = null

    inner class MyViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView) {
        fun bind(items: NoteModel) {
            itemView.name.text = items.txtYesterday
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context)
            .inflate(R.layout.item_note, parent, false)
        return MyViewHolder(view, context as Context)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setList(notes: List<NoteModel>) {
        items.addAll(notes)
        notifyDataSetChanged()
    }

    fun editItem(noteModel : NoteModel, position: Int) {
        items.add(position, noteModel)
        notifyItemChanged(position)
    }

    fun addNewItem(noteModel: NoteModel) {
        items.add(0, noteModel)
        notifyDataSetChanged()
    }
}