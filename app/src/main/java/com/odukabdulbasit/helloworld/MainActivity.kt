package com.odukabdulbasit.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //You can check this result by clicking Logcat tab in bottom menu
        helloWorld()
    }

    private fun helloWorld() {
        Log.i("message", "Hello World!")
    }
}