package org.ablx.cardroom.cardroombackend.entities


import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Player() {

    constructor(id: Long, name: String, cardroom: Cardroom) : this() {
        this.id = id
        this.name = this.name
        this.cardroom = cardroom

    }

    @Id var id: Long = 0
    lateinit var name: String

    @ManyToOne
    lateinit var cardroom: Cardroom


}