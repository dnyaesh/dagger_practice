package com.dnyanesh.daggerpractice

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {
    override fun start() {
       Log.e(TAG, "Diesel engine started....")
    }
}