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

//        프레그먼트 어댑터에 메인 xml어댑터와 연결 해주는 작업
//        supportFragmentManager를 넣어줘야함
        mFragmentAdapter= FragmentAdapter(supportFragmentManager)
        mainViewpager.adapter=mFragmentAdapter
        
//        페그먼트가 많아지면 화면을 부드럽게 적용해주는 기능
        mainViewpager.offscreenPageLimit= 3

        mainTabLayout.setupWithViewPager(mainViewpager)

    }
}