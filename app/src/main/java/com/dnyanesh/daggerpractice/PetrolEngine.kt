package com.dnyanesh.daggerpractice

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {
    override fun start() {
        Log.e(TAG, "Petrol engine started....")
    }
}