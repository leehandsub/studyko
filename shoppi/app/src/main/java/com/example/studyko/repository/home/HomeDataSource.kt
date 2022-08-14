package com.example.studyko.repository.home

import com.example.studyko.model.HomeData


interface HomeDataSource {

    fun getHomeData(): HomeData?
}