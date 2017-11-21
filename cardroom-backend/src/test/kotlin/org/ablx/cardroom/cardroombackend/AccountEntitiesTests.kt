package org.ablx.cardroom.cardroombackend

import org.ablx.cardroom.cardroombackend.entities.Account
import org.ablx.cardroom.cardroombackend.repository.AccountRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import kotlin.test.assertEquals

@RunWith(SpringRunner::class)
@SpringBootTest
internal class AccountEntitiesTests {

    @Autowired
    lateinit var accountRepository: AccountRepository;


    @Test
    fun testFindOne() {
        var account: Account = accountRepository.findOne(1)
        assertEquals(1, account.id)
        assertEquals("name_player", account.player.name)
        assertEquals(1, account.player.cardroom.id)
    }

}
