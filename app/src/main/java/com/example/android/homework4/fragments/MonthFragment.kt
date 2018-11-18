package com.example.android.homework4.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.homework4.R
import com.example.android.homework4.adapters.MonthAdapter
import kotlinx.android.synthetic.main.fragment_layout.view.*

class MonthFragment : Fragment() {

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

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = MonthAdapter()
    }
}