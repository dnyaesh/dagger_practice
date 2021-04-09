package com.dnyanesh.daggerpractice

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun enableRemote(car: Car) {
        Log.e(TAG, "Remote connected.....")
    }
}