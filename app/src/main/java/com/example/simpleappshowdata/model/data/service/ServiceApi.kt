package com.example.simpleappshowdata.model.data.service

import com.example.simpleappshowdata.entity.WorldDate
import io.reactivex.Single
import retrofit2.http.GET

interface ServiceApi {

    @GET("Europe/Minsk")
    fun getCurrentDateInMinsk ():Single<WorldDate>
}