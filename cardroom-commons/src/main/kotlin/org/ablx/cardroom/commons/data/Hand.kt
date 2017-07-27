package org.ablx.cardroom.commons.data

import kotlin.collections.HashMap

data class Hand(val id: Long) {
    var players = HashMap<Int, Player>()


    var playersByName = HashMap<String, Player>()

}