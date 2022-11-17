package com.example.recycapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customadapter (private val userslist : ArrayList<names> ):
    RecyclerView.Adapter<customadapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
           val user = userslist[position]
        holder.txt_one.text = user.home
        holder.txt_two.text = user.english
        holder.txt_three.text = user.nickname
    }

    override fun getItemCount(): Int {
        return userslist.size
    }


    class ViewHolder(itemview : View) :RecyclerView.ViewHolder(itemview){
         val txt_one : TextView = itemView.findViewById(R.id.txtVtwo)
        val txt_two : TextView = itemView.findViewById(R.id.textVthree)
        val txt_three : TextView = itemView.findViewById(R.id.txtVfour)
    }
}