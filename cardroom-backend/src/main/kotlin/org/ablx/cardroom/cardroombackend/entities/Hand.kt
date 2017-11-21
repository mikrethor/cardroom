package org.ablx.cardroom.cardroombackend.entities

import java.util.*
import javax.persistence.*

@Entity
internal data class Hand(
        @Id
        @Column(name = "id", unique = true, nullable = false)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hand_id_sequence")
        @SequenceGenerator(name = "hand_id_sequence", sequenceName = "hand_id_seq", allocationSize = 1)
        var id: Long = 0,
        @ManyToOne
        var cardroom: Cardroom=Cardroom(),
        @field: OneToMany
        var players: List<Player> = emptyList(),
        var handDate: Date=Date(),
        var actionFlop: String? = null,
        var actionTurn: String? = null,
        val actionRiver: String? = null,
        val actionShowdown: String? = null,
        val playerPreflop: String? = null,
        val playerFlop: String? = null,
        val playerTurn: String? = null,
        val playerRiver: String? = null,
        val playerShowdown: String? = null
)