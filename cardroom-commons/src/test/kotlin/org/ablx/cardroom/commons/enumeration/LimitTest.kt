package org.ablx.cardroom.commons.enumeration

import org.junit.Test
import kotlin.test.assertEquals

class LimitTest {
    @Test
    fun testAllLimits() {
        assertEquals(Limit.values().size, 3)

        assertEquals(Limit.NL.limit, "NL")
        assertEquals(Limit.NL.description, "No limit")

        assertEquals(Limit.FL.limit, "FL")
        assertEquals(Limit.FL.description, "Fixed limit")

        assertEquals(Limit.PL.limit, "PL")
        assertEquals(Limit.PL.description, "Pot limit")

    }
}