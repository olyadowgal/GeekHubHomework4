package com.example.android.homework4.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.android.homework4.fragments.DayFragment
import com.example.android.homework4.fragments.MonthFragment
import com.example.android.homework4.fragments.ZodiacFragment

class MainAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    companion object {
        const val TABS_NUMBER = 3
    }
    override fun getCount(): Int {
        return TABS_NUMBER
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> DayFragment()
            1 -> MonthFragment()
            else -> ZodiacFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "DAYS"
            1 -> "MONTH"
            else -> "ZODIAC SIGNS"
        }
    }
}