package org.ablx.cardroom.cardroombackend

import org.ablx.cardroom.cardroombackend.entities.Account
import org.ablx.cardroom.cardroombackend.repository.AccountRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
internal class AccountEntitiesTests(val accountRepository: AccountRepository) {

    @Test
    fun testFindOne() {
        val account: Account = accountRepository.getOne(1L)
        assertEquals(1, account.id)
        assertEquals("name_player", account.player.name)
        assertEquals(1, account.player.cardroom.id)
    }
}
