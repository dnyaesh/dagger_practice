package com.dnyanesh.daggerpractice.model

import android.util.Log

class DieselEngine(val horsePower: Int): Engine {
    override fun start() {
       Log.e(TAG, "Diesel engine $horsePower hp started....")
    }
}