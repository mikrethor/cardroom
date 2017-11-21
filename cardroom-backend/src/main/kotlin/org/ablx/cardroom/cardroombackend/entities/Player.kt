package org.ablx.cardroom.cardroombackend.entities


import javax.persistence.*

@Entity
internal data class Player(
        @field: Id
        @Column(name = "id", unique = true, nullable = false)
        @field: GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_id_sequence")
        @SequenceGenerator(name = "player_id_sequence", sequenceName = "player_id_seq", allocationSize = 1)
        var id: Long = 0,
        var name: String="",
        @ManyToOne
        var cardroom: Cardroom=Cardroom()
)