package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("activity","oncreate call")

        btn.setOnClickListener {
            val check1 = ck1.isChecked
            val check2 = ck2.isChecked

            if(!(check1 xor check2)){
                Toast.makeText(this,"하나만 선택",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(check1){
                val intent = Intent(this@MainActivity,Main2Activity::class.java)
                intent.putExtra("data1","check!")
                startActivity(intent)
            }
            if(check2){
                val intent = Intent(this@MainActivity,Main3Activity::class.java)
                intent.putExtra("data2",10)
                startActivity(intent)
            }

        }
    }
}
