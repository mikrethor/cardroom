package org.ablx.cardroom.cardroombackend.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Hand() {
    constructor(id: Long, cardroom: Cardroom,handDate: Date) : this() {
        this.id = id
        this.cardroom = cardroom
        this.handDate = handDate

    }

    @Id var id: Long = 0

    @ManyToOne
    lateinit var cardroom: Cardroom

    lateinit var handDate: Date

}