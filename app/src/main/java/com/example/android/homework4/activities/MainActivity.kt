package com.example.android.homework4.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import com.example.android.homework4.R
import com.example.android.homework4.adapters.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = main_tabs
        val mainViewPager = main_viewPager

        mainViewPager.adapter = MainAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(mainViewPager)
}
}
