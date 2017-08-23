package org.ablx.cardroom.commons.utils

import org.junit.Test
import kotlin.test.assertEquals

class RomanNumeralTest {
    @Test
    fun testRomanNumerals() {
        assertEquals(1, RomanNumeralUtils.toInt("I"))
        assertEquals(2, RomanNumeralUtils.toInt("II"))
        assertEquals(3, RomanNumeralUtils.toInt("III"))
        assertEquals(4, RomanNumeralUtils.toInt("IV"))
        assertEquals(5, RomanNumeralUtils.toInt("V"))
        assertEquals(6, RomanNumeralUtils.toInt("VI"))
        assertEquals(7, RomanNumeralUtils.toInt("VII"))
        assertEquals(8, RomanNumeralUtils.toInt("VIII"))
        assertEquals(9, RomanNumeralUtils.toInt("IX"))
        assertEquals(10, RomanNumeralUtils.toInt("X"))
        assertEquals(11, RomanNumeralUtils.toInt("XI"))

        assertEquals(20, RomanNumeralUtils.toInt("XX"))

        assertEquals(30, RomanNumeralUtils.toInt("XXX"))

        assertEquals(40, RomanNumeralUtils.toInt("XL"))

        assertEquals(50, RomanNumeralUtils.toInt("L"))

        assertEquals(90, RomanNumeralUtils.toInt("XC"))

        assertEquals(100, RomanNumeralUtils.toInt("C"))

        assertEquals(110, RomanNumeralUtils.toInt("CX"))

        assertEquals(400, RomanNumeralUtils.toInt("CD"))

        assertEquals(500, RomanNumeralUtils.toInt("D"))

        assertEquals(600, RomanNumeralUtils.toInt("DC"))

        assertEquals(1000, RomanNumeralUtils.toInt("M"))
    }
}