package com.paavam.couterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //var - varying variables
    //val - static variables
    var answer = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting up the fvbId
        val result_tv = findViewById<TextView>(R.id.result_tv)
        val inc_btn = findViewById<Button>(R.id.inc_button)

        inc_btn.setOnClickListener {
            answer += 1
            result_tv.setText(answer.toString())
        }

        val reset = findViewById<Button>(R.id.res_button)
        reset.setOnClickListener {
            answer = 0
            result_tv.setText(answer.toString())
        }

    }
}