package com.example.simpleappshowdata.presenters.main

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import moxy.MvpPresenter
import moxy.MvpView

open class BasePresenter<V: MvpView> : MvpPresenter<V>() {

    private val disposable = CompositeDisposable()

    override fun onDestroy() {
        disposable.dispose()
    }

    protected fun Disposable.connect(){
        disposable.add(this)
    }
}