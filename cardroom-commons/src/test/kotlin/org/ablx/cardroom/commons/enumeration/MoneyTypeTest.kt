package org.ablx.cardroom.commons.enumeration

import org.junit.Test
import kotlin.test.assertEquals

class MoneyTypeTest {
    @Test
    fun testAllMoneyType() {

        assertEquals(MoneyType.values().size, 2)

        assertEquals(MoneyType.PLAY_MONEY.type, "Play money")
        assertEquals(MoneyType.REAL_MONEY.type, "Real money")


    }
}