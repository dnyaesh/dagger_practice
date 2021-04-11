package com.dnyanesh.daggerpractice

import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}