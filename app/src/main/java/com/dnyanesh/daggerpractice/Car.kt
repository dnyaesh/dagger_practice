package com.dnyanesh.daggerpractice

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheel, val engine: Engine) {
    companion object{
        const val TAG = "Dagger Car"
    }

    fun drive(){
        Log.e(TAG, "I am driving")
    }
}