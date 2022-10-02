package com.example.tiptime.test

import com.example.tiptime.calculateTip
import org.junit.Test

import org.junit.Assert.*

class TipCalculatorTest {

    @Test
    fun calculate_20_percent_tip_no_roundup() {

        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = "$2.00"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        //assertEquals(expected =  expectedTip,actual =  actualTip)

    }

}