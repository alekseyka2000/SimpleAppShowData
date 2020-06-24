package com.example.simpleappshowdata.presenters.time

import io.reactivex.Single
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface TimeView : MvpView {
    fun getMinskTime(time: String)
    fun showThrowable(t: Throwable)
}