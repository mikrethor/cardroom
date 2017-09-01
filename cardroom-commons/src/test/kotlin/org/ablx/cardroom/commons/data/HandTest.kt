package org.ablx.cardroom.commons.data

import org.ablx.cardroom.commons.enumeration.Domain
import org.ablx.cardroom.commons.enumeration.Operator
import org.junit.Test
import kotlin.test.assertEquals

class HandTest {
    @Test
    fun testHandInit() {

        val hand = Hand("handid")
        assertEquals("handid", hand.cardroomHandId)

    }
}