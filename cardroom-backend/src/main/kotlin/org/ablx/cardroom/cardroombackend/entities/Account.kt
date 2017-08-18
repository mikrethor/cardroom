package org.ablx.cardroom.cardroombackend.entities


import javax.persistence.*

@Entity
class Account() {

    constructor(id: Long, player: Player) : this() {
        this.id = id

        this.player = player

    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_id_sequence")
    @SequenceGenerator(name = "account_id_sequence", sequenceName = "account_id_seq", allocationSize = 1)
    var id: Long = 0


    @ManyToOne
    lateinit var player: Player


}