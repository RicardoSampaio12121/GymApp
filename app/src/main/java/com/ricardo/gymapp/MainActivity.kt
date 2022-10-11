package com.ricardo.gymapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ricardo.gymapp.mainPage.MainPageFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.frameFragment, MainPageFragment.newInstance(), "olabebe").commit()

    }

}