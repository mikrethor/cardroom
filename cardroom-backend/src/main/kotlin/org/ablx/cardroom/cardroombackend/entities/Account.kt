package org.ablx.cardroom.cardroombackend.entities


import javax.persistence.*

@Entity
internal data class Account(
        @field: Id
        @Column(name = "id", unique = true, nullable = false)
        @field: GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_id_sequence")
        @SequenceGenerator(name = "account_id_sequence", sequenceName = "account_id_seq", allocationSize = 1)
        var id: Long=0,//Primary key
        @ManyToOne
        var player: Player= Player()
)