package org.ablx.cardroom.commons.data


import org.ablx.cardroom.commons.enumeration.Domain
import org.ablx.cardroom.commons.enumeration.Operator
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