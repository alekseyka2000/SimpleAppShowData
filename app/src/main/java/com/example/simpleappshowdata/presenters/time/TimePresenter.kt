package com.example.simpleappshowdata.presenters.time

import com.example.simpleappshowdata.model.interactor.WorldDateInteractor
import com.example.simpleappshowdata.model.system.scheduler.AppSchedulers
import com.example.simpleappshowdata.presenters.main.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import moxy.InjectViewState

@InjectViewState
class TimePresenter : BasePresenter<TimeView>() {

    fun getTime() {
        WorldDateInteractor().getDateInMinsk()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({response ->setTime(response)},
                {t -> onShowError(t)}
            )
    }

    private fun onShowError(t: Throwable) {
        viewState.showThrowable(t)
    }

    fun setTime(it:String){
        viewState.getMinskTime(it)
    }
}