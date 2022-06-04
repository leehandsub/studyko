package com.example.studyko.repository

import com.example.studyko.model.HomeData

class HomeRepository(
    private val assetDataSource: HomeAssetDataSource
) {

    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeData()
    }
}