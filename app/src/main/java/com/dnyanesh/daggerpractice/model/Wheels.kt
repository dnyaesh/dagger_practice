package com.dnyanesh.daggerpractice.model

import com.dnyanesh.daggerpractice.model.Rims
import com.dnyanesh.daggerpractice.model.Tires
import javax.inject.Inject

class Wheels @Inject constructor(rims: Rims, tires: Tires) {
}