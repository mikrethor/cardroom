package org.ablx.cardroom.commons.enumeration

import org.ablx.cardroom.commons.data.Cardroom
import org.ablx.cardroom.commons.data.HandAction
import org.ablx.cardroom.commons.data.Player
import org.junit.Test
import kotlin.test.assertEquals

class HandActionTest {
    @Test
    fun testHandActionInit() {
        val cardroom = Cardroom(1, Operator.WINAMAX, Domain.COM, "url")
        val player = Player(1, "dd", cardroom)
        val handAction = HandAction(player, Action.FOLDS, 1.0, arrayOf(Card.C_AC, Card.C_AD))

        assertEquals(1, handAction.player?.id)
        assertEquals("dd", handAction.player?.name)
        assertEquals(Action.FOLDS, handAction.action)
        assertEquals(1.0, handAction.amount)
    }
}