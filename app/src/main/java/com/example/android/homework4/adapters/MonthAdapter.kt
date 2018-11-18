package com.example.android.homework4.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.android.homework4.R
import com.example.android.homework4.adapters.MonthAdapter.MonthViewHolder
import com.example.android.homework4.month

class MonthAdapter : RecyclerView.Adapter<MonthViewHolder>() {

    override fun onBindViewHolder(holder: MonthViewHolder, position: Int) {
        holder.onBind(monthList[position])
    }

    private val monthList: List<String> = month

    override fun getItemCount(): Int {
        return monthList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MonthViewHolder {
        return MonthViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_month,
                parent,
                false
            )
        )
    }


    inner class MonthViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val itemText: TextView = view.findViewById(R.id.item_text)

        fun onBind(item: String) {
            itemText.text = item
        }
    }
}