package org.ablx.cardroom.commons.data

import org.ablx.cardroom.commons.enumeration.Domain
import org.ablx.cardroom.commons.enumeration.Operator
import org.junit.Test
import kotlin.test.assertEquals

class HandTest {
    @Test
    fun testHandInit() {
        val cardroom = Cardroom(1, Operator.WINAMAX, Domain.COM, "url")
        val player = Player(1, "dd", cardroom)
        val hand = Hand("handid")
        assertEquals("handid", hand.cardroomHandId)

    }
}