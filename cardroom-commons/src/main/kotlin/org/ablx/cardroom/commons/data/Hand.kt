package org.ablx.cardroom.commons.data

import org.ablx.cardroom.commons.enumeration.Currency
import java.util.*
import kotlin.collections.HashMap

data class Hand(val cardroomHandId: String) {
    var players: MutableMap<Int, Player>? = null
    var id: Long? = null
    var handDate: Date = Date()
    var currency: Currency = Currency.EURO
    var bigBlind: Double = 0.0
    var smallBlind: Double = 0.0
    var level: Int = 0
    var fee: Double = 0.0
    var buyIn: Double = 0.0
    var handActions: List<HandAction>? = null


    var playersByName = HashMap<String, Player>()
    override fun toString(): String {
        return "Hand(cardroomHandId='$cardroomHandId', players=$players, id=$id, handDate=$handDate, currency=$currency, bigBlind=$bigBlind, smallBlind=$smallBlind, level=$level, fee=$fee, buyIn=$buyIn, playersByName=$playersByName)"
    }


}