package com.dnyanesh.daggerpractice

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(val horsePower: Int) {

    @Provides
    fun provideDieselEngine(): Engine = DieselEngine(horsePower)
}