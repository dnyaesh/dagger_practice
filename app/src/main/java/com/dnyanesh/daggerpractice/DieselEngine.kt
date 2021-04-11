package com.dnyanesh.daggerpractice

import android.util.Log
import javax.inject.Inject

class DieselEngine(val horsePower: Int): Engine {
    override fun start() {
       Log.e(TAG, "Diesel engine $horsePower hp started....")
    }
}