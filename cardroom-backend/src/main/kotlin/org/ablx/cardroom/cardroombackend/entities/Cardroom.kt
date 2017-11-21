package org.ablx.cardroom.cardroombackend.entities

import javax.persistence.*

@Entity
internal data class Cardroom(
        @field: Id
        @Column(name = "id", unique = true, nullable = false)
        @field: GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cardroom_id_sequence")
        @SequenceGenerator(name = "cardroom_id_sequence", sequenceName = "cardroom_id_seq", allocationSize = 1)
        var id: Long = 0,
        var operator: String="",
        var domain: String="",
        var url: String="")