package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class fibonnacCiRecyclerView(var numbers:List<Int>):RecyclerView.Adapter<NamesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonacci_numbers_items,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.tvNumbers.text= numbers[position].toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}
class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var tvNumbers: TextView = itemView.findViewById<TextView>(R.id.tvNumbers)

}