package org.ablx.cardroom.commons.data

import org.ablx.cardroom.commons.enumeration.Card
import org.ablx.cardroom.commons.enumeration.Currency
import java.util.*
import kotlin.collections.HashMap

data class Hand(var cardroomHandId: String) {
    lateinit var players: MutableMap<Int, Player>
    lateinit var playersSeatByName: MutableMap<String, Int>
    var cardroom: Cardroom? = null
    var id: Long? = null
    var handDate: Date = Date()
    var currency: Currency = Currency.EURO
    var bigBlind: Double = 0.0
    var smallBlind: Double = 0.0
    var rake: Double = 0.0
    var totalPot: Double = 0.0
    var level: Int = 0
    var fee: Double = 0.0
    var buyIn: Double = 0.0
    var numberOfPlayerByTable = 0
    var handActions: List<HandAction>? = null
    var buttonSeat = 0
    var dealerPlayer: Player? = null
    var smallBlindPlayer: Player? = null
    var bigBlindPlayer: Player? = null
    var accountPlayer: Player? = null
    lateinit var cardroomTableId: String

    lateinit var date:Date
    lateinit var preflopActions: MutableList<HandAction>
    lateinit var flopActions: MutableList<HandAction>
    lateinit var turnActions: MutableList<HandAction>
    lateinit var riverActions: MutableList<HandAction>
    lateinit var showdownActions: MutableList<HandAction>
    lateinit var actions: MutableList<HandAction>

    var flop: Array<Card?>? = null
    var turn: Card? = null
    var river: Card? = null

    var playersByName = HashMap<String, Player>()
    override fun toString(): String {
        return "Hand(cardroomHandId='$cardroomHandId', players=$players, id=$id, handDate=$handDate, currency=$currency, bigBlind=$bigBlind, smallBlind=$smallBlind, level=$level, fee=$fee, buyIn=$buyIn, playersByName=$playersByName)"
    }

    fun addPlayer(player: Player) {
        players.put(player.seat, player)
        playersByName.put(player.name, player)
        playersSeatByName.put(player.name, player.seat)

    }
}
