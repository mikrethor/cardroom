package org.ablx.cardroom.commons.enumeration

import org.junit.Test
import kotlin.test.assertEquals

class OperatorTest {
    @Test
    fun testAllOperators() {
        assertEquals(Operator.values().size, 2)

        assertEquals(Operator.POKERSTARS.operatorName, "Pokerstars")
        assertEquals(Operator.WINAMAX.operatorName, "Winamax")

    }
}