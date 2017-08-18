package org.ablx.cardroom.cardroombackend.entities

import javax.persistence.*

@Entity
class Cardroom() {
    constructor(id: Long, operator: String, domain: String, url: String) : this() {
        this.id = id
        this.operator = operator
        this.domain = domain
        this.url = url
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cardroom_id_sequence")
    @SequenceGenerator(name = "cardroom_id_sequence", sequenceName = "cardroom_id_seq", allocationSize = 1)
    var id: Long = 0
    lateinit var operator: String
    lateinit var domain: String
    lateinit var url: String
}