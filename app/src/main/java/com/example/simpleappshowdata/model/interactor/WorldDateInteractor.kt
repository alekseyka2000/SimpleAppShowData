package com.example.simpleappshowdata.model.interactor

import com.example.simpleappshowdata.model.data.service.MinskDataService
import com.example.simpleappshowdata.model.system.scheduler.AppSchedulers
import io.reactivex.Single

class WorldDateInteractor constructor(
    private val API: MinskDataService = MinskDataService()
) {

    fun getDateInMinsk(): Single<String> =
        API.getApi()
        .getCurrentDateInMinsk()
            .map { it.datetime }
}