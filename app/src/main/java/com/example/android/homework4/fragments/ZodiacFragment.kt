package com.example.android.homework4.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.homework4.R
import com.example.android.homework4.adapters.ZodiacAdapter
import kotlinx.android.synthetic.main.fragment_layout.view.*

class ZodiacFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(
            R.layout.fragment_layout,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.fragment_recycler_view

        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = ZodiacAdapter()
    }
}