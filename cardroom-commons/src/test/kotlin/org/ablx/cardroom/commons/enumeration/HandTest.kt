package org.ablx.cardroom.commons.enumeration

import org.ablx.cardroom.commons.data.Account
import org.ablx.cardroom.commons.data.Cardroom
import org.ablx.cardroom.commons.data.Hand
import org.ablx.cardroom.commons.data.Player
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