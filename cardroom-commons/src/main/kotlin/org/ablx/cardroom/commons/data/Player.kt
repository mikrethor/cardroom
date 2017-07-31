package org.ablx.cardroom.commons.data

import org.ablx.cardroom.commons.enumeration.Card


data class Player(val id: Long?, val name: String, val cardroom: Cardroom) {

    var stack: Double = 0.0

    var seat: Int = 0

    var on: Boolean = false

    var cards: Array<Card?>? = null


}
