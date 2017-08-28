package org.ablx.cardroom.commons.enumeration

import org.junit.Test
import kotlin.test.assertEquals

class PokerTypeTest {
    @Test
    fun testAllPokerType() {

        assertEquals(PokerType.values().size, 5)

        assertEquals(PokerType.HOLDEM.type, "Hold'em")
        assertEquals(PokerType.HOLDEM.ordinal, 0)

        assertEquals(PokerType.OMAHA.type, "Omaha")
        assertEquals(PokerType.OMAHA.ordinal, 1)

        assertEquals(PokerType.OHILO.type, "Omaha Hi/Lo")
        assertEquals(PokerType.OHILO.ordinal, 2)

        assertEquals(PokerType.RAZZ.type, "Razz")
        assertEquals(PokerType.RAZZ.ordinal, 3)

        assertEquals(PokerType.STUD.type, "Stud")
        assertEquals(PokerType.STUD.ordinal, 4)

    }
}