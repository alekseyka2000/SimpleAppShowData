package com.example.simpleappshowdata.model.system.scheduler

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object AppSchedulers : SchedulersProvider {

    override fun ui() = AndroidSchedulers.mainThread()
    override fun computation() = Schedulers.computation()
    override fun trampoline() = Schedulers.trampoline()
    override fun newThead() = Schedulers.newThread()
    override fun io() = Schedulers.io()
}