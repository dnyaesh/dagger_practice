package com.dnyanesh.daggerpractice.di

import com.dnyanesh.daggerpractice.model.Engine
import com.dnyanesh.daggerpractice.model.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}