package com.example.studyko.repository

import com.example.studyko.model.HomeData


interface HomeDataSource {

    fun getHomeData(): HomeData?
}