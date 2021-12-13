package com.furkankurt.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun first_click(view: View)
    {
        val fragmentManager =supportFragmentManager
        val fragmentTransition =fragmentManager.beginTransaction()

        val firstFragment = FirstFragment()
        fragmentTransition.replace(R.id.frameLayout,firstFragment).commit() }



    fun second_click(view: View)
    {
        val fragmentManager =supportFragmentManager
        val fragmentTransition =fragmentManager.beginTransaction()

        val secondFragment = SecondFragment()
        fragmentTransition.replace( R.id.frameLayout,secondFragment).commit()
    }
}