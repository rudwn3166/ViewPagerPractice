package com.example.viewpagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.viewpagerpractice.adapters.FragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mFragmentAdapter : FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFragmentAdapter= FragmentAdapter(supportFragmentManager)
        mainViewpager.adapter=mFragmentAdapter

    }
}