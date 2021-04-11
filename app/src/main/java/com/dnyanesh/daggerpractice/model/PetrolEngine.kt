package com.dnyanesh.daggerpractice.model

import android.util.Log
import com.dnyanesh.daggerpractice.model.Engine
import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {
    override fun start() {
        Log.e(TAG, "Petrol engine started....")
    }
}