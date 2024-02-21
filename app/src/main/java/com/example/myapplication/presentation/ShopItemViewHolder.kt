package com.example.myapplication.presentation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ShopItemViewHolder(view: View): RecyclerView.ViewHolder(view){
    val tvName: TextView = view.findViewById(R.id.tv_name)
    val tvCount: TextView = view.findViewById(R.id.tv_cnt)
}