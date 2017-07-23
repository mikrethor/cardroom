package org.ablx.cardroom.commons.data

data class Hand(val id: Long, val players: Map<Int, Player>, val playersByName: Map<String, Player>) {

}