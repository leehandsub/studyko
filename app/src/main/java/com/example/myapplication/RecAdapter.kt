package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class RecAdapter(val arr:ArrayList<String>):RecyclerView.Adapter<RecAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return Holder(v)
    }

    override fun getItemCount(): Int {
        return arr.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindItems(arr[position])
    }
    inner class Holder(itemView : View):RecyclerView.ViewHolder(itemView){

        fun bindItems(data : String){
            itemView.textitem.text=data

        }
    }


}