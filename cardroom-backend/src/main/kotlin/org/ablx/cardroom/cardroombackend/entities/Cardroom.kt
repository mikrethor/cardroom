package org.ablx.cardroom.cardroombackend.entities

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Cardroom() {
    constructor(id: Long, operator: String, domain: String, url: String) : this() {
        this.id = id
        this.operator = operator
        this.domain = domain
        this.url = url
    }

    @Id var id: Long = 0
    lateinit var operator: String
    lateinit var domain: String
    lateinit var url: String
}