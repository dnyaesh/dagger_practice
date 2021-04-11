package com.dnyanesh.daggerpractice.model

import android.util.Log
import javax.inject.Inject

const val TAG = "Dagger Car"
class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {

    fun drive(){
        engine.start()
        Log.e(TAG, "I am driving")
    }

    @Inject
    fun connectRemote(remote: Remote) {
        remote.enableRemote(this)
    }
}