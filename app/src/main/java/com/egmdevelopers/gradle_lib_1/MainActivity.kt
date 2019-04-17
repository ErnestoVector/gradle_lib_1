package com.egmdevelopers.gradle_lib_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.egmdevelopers.gradle_lib_01.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("Hola Mundo")
    }
}
