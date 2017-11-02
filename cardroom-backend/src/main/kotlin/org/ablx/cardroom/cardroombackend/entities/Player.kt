package org.ablx.cardroom.cardroombackend.entities


import javax.persistence.*

@Entity
class Player() {

    constructor(id: Long, name: String, cardroom: Cardroom) : this() {
        this.id = id
        this.name = this.name
        this.cardroom = cardroom
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_id_sequence")
    @SequenceGenerator(name = "player_id_sequence", sequenceName = "player_id_seq", allocationSize = 1)
    var id: Long = 0
    lateinit var name: String

    @ManyToOne
    lateinit var cardroom: Cardroom
}