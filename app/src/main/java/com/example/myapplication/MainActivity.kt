package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cnt_1=0
        var cnt_2=0
        var cnt_3=0
        val btn_event = findViewById<Button>(R.id.button)
        val btn_event1 = findViewById<Button>(R.id.button2)
        val btn_event2 = findViewById<Button>(R.id.button3)

        btn_event.setOnClickListener{
            textView4.setText(cnt_1++.toString())
        }
        btn_event1.setOnClickListener{
            textView5.setText(cnt_2++.toString())
        }
        btn_event2.setOnClickListener{
            textView6.setText(cnt_3++.toString())
        }

    }
}
