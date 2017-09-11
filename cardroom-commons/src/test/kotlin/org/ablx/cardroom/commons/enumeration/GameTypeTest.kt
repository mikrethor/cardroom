package org.ablx.cardroom.commons.enumeration

import org.junit.Test
import kotlin.test.assertEquals

class GameTypeTest {
    @Test
    fun testAllGameTypes() {
        assertEquals(GameType.values().size, 2)

        assertEquals(GameType.TOURNAMENT.type, "Tournament")
        assertEquals(GameType.CASH.type, "CashGame")

    }
}