package org.ablx.cardroom.commons.enumeration

import org.ablx.cardroom.commons.data.Account
import org.ablx.cardroom.commons.data.Cardroom
import org.ablx.cardroom.commons.data.Player
import org.junit.Test
import kotlin.test.assertEquals

class AccountTest {
    @Test
    fun testAccountInit() {
        val cardroom = Cardroom(1, Operator.WINAMAX, Domain.COM, "url")
        val player = Player(1, "dd", cardroom)
        val account = Account(1, player)
        assertEquals(1, account.player.id)
        assertEquals("dd", account.player.name)
        assertEquals(cardroom, account.player.cardroom)
        assertEquals(1, account.id)
    }
}