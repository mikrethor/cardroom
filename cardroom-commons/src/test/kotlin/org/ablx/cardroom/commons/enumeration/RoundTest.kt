package org.ablx.cardroom.commons.enumeration

import org.junit.Test
import kotlin.test.assertEquals

class RoundTest {
    @Test
    fun testAllRounds() {
        assertEquals(Round.values().size, 5)

        assertEquals(Round.PRE_FLOP.round, "preflop")

        assertEquals(Round.FLOP.round, "flop")

        assertEquals(Round.TURN.round, "turn")

        assertEquals(Round.RIVER.round, "river")

        assertEquals(Round.SHOWDOWN.round, "showdown")

    }
}