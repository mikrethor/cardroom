package org.ablx.cardroom.commons.enumeration


import org.ablx.cardroom.commons.data.Cardroom
import org.ablx.cardroom.commons.data.Player
import org.junit.Test
import kotlin.test.assertEquals

class PlayerTest {
    @Test
    fun testPlayerInit() {
        val cardroom = Cardroom(1, Operator.WINAMAX, Domain.COM, "url")
        val p = Player(1, "dd", cardroom)
        assertEquals(1, p.id)
        assertEquals("dd", p.name)
        assertEquals(cardroom, p.cardroom)


    }
}