package com.example.testetvalisation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.Assert.*

class CalculTDD {

    var calc = Calcul()

    @Test
    fun add(){
        assertThat(calc.calculAdd(2, 3), equalTo(5))
    }

    @Test
    fun sub(){
        assertThat(calc.calculSub(10, 6), equalTo(4))

    }

    @Test
    fun div(){
        assertThat(calc.calculDiv(36, 6), equalTo(6))
    }

    @Test
    fun mul() {
        assertThat(calc.calculMultiple(9, 5), equalTo(45))
    }

}