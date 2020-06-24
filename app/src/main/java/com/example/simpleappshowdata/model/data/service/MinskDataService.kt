package com.example.simpleappshowdata.model.data.service

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory


class MinskDataService {
    private val api = Retrofit.Builder()
        .baseUrl("https://worldtimeapi.org/api/timezone/")
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ServiceApi::class.java)

    fun getApi(): ServiceApi{
        return api
    }
}