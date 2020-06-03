package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_event = findViewById<Button>(R.id.button)


        btn_event.setOnClickListener{
            Edit.clearComposingText()
            Toast.makeText(this,Edit.text.toString(),Toast.LENGTH_SHORT).show()//토스트 보여주기
            textView.setText(Edit.text.toString())
        }

    }
}
