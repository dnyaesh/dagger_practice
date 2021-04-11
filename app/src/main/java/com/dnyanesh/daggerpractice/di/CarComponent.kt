package com.dnyanesh.daggerpractice.di

import com.dnyanesh.daggerpractice.MainActivity
import com.dnyanesh.daggerpractice.model.Car
import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}