package com.example.simpleappshowdata.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleappshowdata.R
import com.example.simpleappshowdata.ui.time.TimeFragment
import moxy.MvpAppCompatActivity
import moxy.MvpView


class MainActivity : AppCompatActivity(), MvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, TimeFragment())
                .commitNow()
        }
    }
}
