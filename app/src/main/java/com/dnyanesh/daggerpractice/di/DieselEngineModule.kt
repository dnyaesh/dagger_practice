package com.dnyanesh.daggerpractice.di

import com.dnyanesh.daggerpractice.model.DieselEngine
import com.dnyanesh.daggerpractice.model.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(val horsePower: Int) {

    @Provides
    fun provideDieselEngine(): Engine = DieselEngine(horsePower)
}