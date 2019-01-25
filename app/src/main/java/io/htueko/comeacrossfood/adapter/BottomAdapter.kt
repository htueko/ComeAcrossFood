package io.htueko.comeacrossfood.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.htueko.comeacrossfood.R

class BottomAdapter(private val header: ArrayList<String>) : RecyclerView.Adapter<BottomAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_card_bottom, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.header.text = header[position]
    }

    override fun getItemCount(): Int {
        return header.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val header: TextView = itemView.findViewById(R.id.txt_header_card)
    }
}