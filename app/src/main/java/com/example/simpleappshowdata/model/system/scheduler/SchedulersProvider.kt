package com.example.simpleappshowdata.model.system.scheduler

import io.reactivex.Scheduler

interface SchedulersProvider {

    fun ui(): Scheduler
    fun computation(): Scheduler
    fun trampoline(): Scheduler
    fun newThead(): Scheduler
    fun io(): Scheduler
}