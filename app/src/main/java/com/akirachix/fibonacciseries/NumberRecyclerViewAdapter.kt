package com.akirachix.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberRecyclerViewAdapter( var numberList: List<Int>):
    RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_items,parent,false)
        return NumberViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumber.text= numberList.toString()
    }
    override fun getItemCount(): Int {
        return numberList.size
    }
}
class NumberViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNumber:TextView = itemView.findViewById<TextView>(R.id.tvNumber)
}




