package com.dnyanesh.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dnyanesh.daggerpractice.di.CarComponent
import com.dnyanesh.daggerpractice.di.DaggerCarComponent
import com.dnyanesh.daggerpractice.di.DieselEngineModule
import com.dnyanesh.daggerpractice.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent: CarComponent = DaggerCarComponent
                        .builder()
                        .dieselEngineModule(DieselEngineModule(100))
                        .build()
        carComponent.inject(this)

        car.drive()
    }
}