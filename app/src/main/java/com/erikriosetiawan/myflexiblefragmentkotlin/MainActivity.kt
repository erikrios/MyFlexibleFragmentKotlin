package com.erikriosetiawan.myflexiblefragmentkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentManager: FragmentManager = supportFragmentManager
        val mFragmentTransaction: FragmentTransaction = mFragmentManager.beginTransaction()
        val mHomeFragment = HomeFragment()

        val fragment: Fragment = mFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)!!

        if (fragment !is HomeFragment) {
            mFragmentTransaction.add(R.id.frame_container, mHomeFragment, HomeFragment::class.java.simpleName)
            Log.d("MyFlexibleFragment", "Fragment Name : ${HomeFragment::class.java.simpleName}")
            mFragmentTransaction.commit()
        }
    }
}
