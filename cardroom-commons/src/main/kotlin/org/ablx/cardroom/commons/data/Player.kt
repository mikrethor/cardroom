package org.ablx.cardroom.commons.data


data class Player(val id: Long?, val name: String, val cardroom: Cardroom) {

    var stack: Double=0.0


    var seat: Int=0


    var on: Boolean=false



}
