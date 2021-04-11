package com.dnyanesh.daggerpractice

import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindDieselEngine(engine: DieselEngine): Engine
}