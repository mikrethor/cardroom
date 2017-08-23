package org.ablx.cardroom.commons.enumeration

import org.junit.Test
import kotlin.test.assertEquals

class SeatTest {
    @Test
    fun testAllSeats() {
        assertEquals(Seat.values().size, 10)

        assertEquals(Seat.ONE.seat, 1)
        assertEquals(Seat.TWO.seat, 2)
        assertEquals(Seat.THREE.seat, 3)
        assertEquals(Seat.FOUR.seat, 4)
        assertEquals(Seat.FIVE.seat, 5)
        assertEquals(Seat.SIX.seat, 6)
        assertEquals(Seat.SEVEN.seat, 7)
        assertEquals(Seat.EIGHT.seat, 8)
        assertEquals(Seat.NINE.seat, 9)
        assertEquals(Seat.TEN.seat, 0)


    }
}