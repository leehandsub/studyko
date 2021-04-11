package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import okhttp3.Call
import okhttp3.Response
import javax.security.auth.callback.Callback


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = NaverAPI.create()

        api.getSearchNews("테스트").enqueue(object : Callback<ResultGetSearchNews> {
            override fun onResponse(
                call: Call<ResultGetSearchNews>,
                response: Response<ResultGetSearchNews>
            ) {
                // 성공
            }

            override fun onFailure(call: Call<ResultGetSearchNews>, t: Throwable) {
                // 실패
            }
        })
    }
}
