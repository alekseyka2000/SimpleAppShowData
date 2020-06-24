package com.example.simpleappshowdata.ui.time

import android.widget.Toast
import com.example.simpleappshowdata.R
import com.example.simpleappshowdata.presenters.time.TimePresenter
import com.example.simpleappshowdata.presenters.time.TimeView
import com.example.simpleappshowdata.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_time.*
import moxy.ktx.moxyPresenter

class TimeFragment : BaseFragment(), TimeView {

    private val timePresenter by moxyPresenter { TimePresenter() }

    override val layout: Int
        get() = R.layout.fragment_time

    override fun onStart() {
        super.onStart()
        timePresenter.getTime()
    }

    override fun getMinskTime(time: String) {
        time_text.text = "Time in Minsk: $time"
    }

    override fun showThrowable(t: Throwable) {
        Toast.makeText(context, t.message , Toast.LENGTH_LONG).show()
    }
}