package org.ablx.cardroom.commons.enumeration


import org.junit.Test
import kotlin.test.assertEquals

class ActionTest {
    @Test
    fun testAllAction() {
        assertEquals(Action.values().size, 7)

        assertEquals(Action.FOLDS.action, "folds")
        assertEquals(Action.FOLDS.value, 1)

        assertEquals(Action.CALLS.action, "calls")
        assertEquals(Action.CALLS.value, 2)

        assertEquals(Action.RAISES.action, "raises")
        assertEquals(Action.RAISES.value, 3)

        assertEquals(Action.CHECKS.action, "checks")
        assertEquals(Action.CHECKS.value, 4)

        assertEquals(Action.BETS.action, "bets")
        assertEquals(Action.BETS.value, 5)

        assertEquals(Action.COLLECTED.action, "collected")
        assertEquals(Action.COLLECTED.value, 6)

        assertEquals(Action.SHOWS.action, "shows")
        assertEquals(Action.SHOWS.value, 7)
    }

    @Test
    fun testValueOf() {
        assertEquals(Action.FOLDS,Action.valueOfCode("folds"))
        assertEquals(Action.CALLS,Action.valueOfCode( "calls"))
        assertEquals(Action.RAISES, Action.valueOfCode("raises"))
        assertEquals(Action.CHECKS, Action.valueOfCode("checks"))
        assertEquals(Action.BETS, Action.valueOfCode("bets"))
        assertEquals(Action.COLLECTED, Action.valueOfCode("collected"))
        assertEquals(Action.SHOWS, Action.valueOfCode("shows"))
        try{
             Action.valueOfCode("error")
        }catch (e:IllegalArgumentException){
            assertEquals("No enum constant org.ablx.cardroom.commons.enumeration.Action.ERROR",e.message)
        }
    }
}