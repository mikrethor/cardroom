package org.ablx.cardroom.cardroombackend

import org.ablx.cardroom.cardroombackend.entities.Hand
import org.ablx.cardroom.cardroombackend.repository.HandRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import kotlin.test.assertEquals

@RunWith(SpringRunner::class)
@SpringBootTest
internal class HandEntitiesTests {

    @Autowired
    lateinit var handRepository: HandRepository;

    @Test
    fun testFindOne() {
        var hand: Hand = handRepository.findOne(1)
        assertEquals(1, hand.id)
        assertEquals(1, hand.cardroom.id)
    }

}
