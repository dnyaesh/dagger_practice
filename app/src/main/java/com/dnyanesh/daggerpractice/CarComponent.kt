package com.dnyanesh.daggerpractice

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}