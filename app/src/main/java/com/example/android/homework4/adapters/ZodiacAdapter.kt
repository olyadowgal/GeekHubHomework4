package com.example.android.homework4.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.homework4.R
import com.example.android.homework4.enities.ZodiacItem
import com.example.android.homework4.zodiacSigns
import kotlinx.android.synthetic.main.item_zodiac_sign.view.*

class ZodiacAdapter : RecyclerView.Adapter<ZodiacAdapter.ZodiacViewHolder>() {

    private val zodiacList : List<ZodiacItem> = zodiacSigns

    override fun onBindViewHolder(holder: ZodiacAdapter.ZodiacViewHolder, position: Int) {
        holder.onBind(zodiacList[position])
    }

    override fun getItemCount(): Int {
        return zodiacList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ZodiacAdapter.ZodiacViewHolder {
        return ZodiacViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_zodiac_sign,
                parent,
                false
            )
        )
    }

    inner class ZodiacViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val ZodiacImage = view.zodiac_image
        private val ZodiacName = view.zodiac_name

        fun onBind(zodiacSign: ZodiacItem) {
            ZodiacImage.setImageResource(zodiacSign.imageId)
            ZodiacName.text = zodiacSign.text
        }
    }

}