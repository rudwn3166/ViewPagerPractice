package com.example.viewpagerpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice.fragments.GreetingFragment
import com.example.viewpagerpractice.fragments.InfoFragment
import com.example.viewpagerpractice.fragments.NameFragment

class FragmentAdapter(fm : FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return NameFragment()
        }
        else if (position == 1) {
            return InfoFragment()
        }
        else {
            return GreetingFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }

}