package com.example.viewpagerpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice.fragments.GreetingFragment
import com.example.viewpagerpractice.fragments.InfoFragment
import com.example.viewpagerpractice.fragments.NameFragment

class FragmentAdapter(fm : FragmentManager): FragmentPagerAdapter(fm) {


    override fun getPageTitle(position: Int): CharSequence? {

        return when (position){
            0->"이름"
            1->"정보"
            else->"인사말"

        }


    }


    override fun getItem(position: Int): Fragment {

        return when (position){

            0->NameFragment()
            1->InfoFragment()
            else->GreetingFragment()

        }

    }

    override fun getCount(): Int {
        return 3
    }

}