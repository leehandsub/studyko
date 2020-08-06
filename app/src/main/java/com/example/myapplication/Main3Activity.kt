package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    var lastClickedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val intent = Intent(this.intent)
        var num:Int = intent.getIntExtra("data2",0)

        activity3.text = "$num"
    }

    override fun onBackPressed() {
        var currentTime = System.currentTimeMillis()

        if (currentTime - lastClickedTime < 1000) {
            finish()
        } else {
            Toast.makeText(this, "한번더 누르면 종료됩니다", Toast.LENGTH_SHORT).show()
        }
        lastClickedTime = currentTime
    }
}
