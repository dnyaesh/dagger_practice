package com.dnyanesh.daggerpractice

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun providesRims() = Rims()

    @Provides
    fun providesTires(): Tires{
        val tires = Tires()
        tires.inflateTires()
        return tires
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires)= Wheels(rims, tires)
}