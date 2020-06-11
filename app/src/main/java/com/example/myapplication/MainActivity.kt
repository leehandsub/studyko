package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val btn_event = findViewById<Button>(R.id.button)

        val arr = arrayListOf<String>()
        button.setOnClickListener{
            //Toast.makeText(this,edit.text.toString(),Toast.LENGTH_SHORT).show()//토스트 보여주기
            arr.add(edit.text.toString())
            edit.setText("")
        }
        recycler.run{
            layoutManager=LinearLayoutManager(context)
            adapter=RecAdapter(arr)
        }


    }
}
