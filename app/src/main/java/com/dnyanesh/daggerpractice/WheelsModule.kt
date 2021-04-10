package com.dnyanesh.daggerpractice

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Module
    companion object{
        @JvmStatic
        @Provides
        fun providesRims() = Rims()

        @JvmStatic
        @Provides
        fun providesTires(): Tires{
            val tires = Tires()
            tires.inflateTires()
            return tires
        }

        @JvmStatic
        @Provides
        fun providesWheels(rims: Rims, tires: Tires)= Wheels(rims, tires)
    }
}