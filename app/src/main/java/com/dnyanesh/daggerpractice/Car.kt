package com.dnyanesh.daggerpractice

import android.util.Log
import javax.inject.Inject

const val TAG = "Dagger Car"
class Car @Inject constructor(val wheels: Wheel, val engine: Engine) {

    fun drive(){
        Log.e(TAG, "I am driving")
    }

    @Inject
    fun connectRemote(remote: Remote) {
        remote.enableRemote(this)
    }
}