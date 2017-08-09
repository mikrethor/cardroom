package org.ablx.cardroom.cardroombackend.entities


import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Account() {

    constructor(id: Long, player: Player) : this() {
        this.id = id

        this.player = player

    }

    @Id var id: Long = 0


    @ManyToOne
    lateinit var player: Player


}