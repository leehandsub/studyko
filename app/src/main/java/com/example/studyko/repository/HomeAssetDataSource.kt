package com.example.studyko.repository

import com.example.studyko.AssetLoader
import com.example.studyko.model.HomeData
import com.google.gson.Gson


class HomeAssetDataSource(private val assetLoader: AssetLoader) : HomeDataSource {

    private val gson = Gson()

    override fun getHomeData(): HomeData? {
        return assetLoader.getJsonString("home.json")?.let { homeJsonString ->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }
    }
}