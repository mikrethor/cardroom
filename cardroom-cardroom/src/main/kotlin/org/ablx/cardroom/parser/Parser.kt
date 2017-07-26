package org.ablx.cardroom.parser

import org.ablx.cardroom.commons.data.Hand
import org.ablx.cardroom.commons.data.Player
import org.ablx.cardroom.commons.enumeration.Action
import org.ablx.cardroom.commons.enumeration.Card
import org.ablx.cardroom.commons.enumeration.Currency
import org.ablx.cardroom.commons.enumeration.GameType
import java.util.*


interface Parser {
    fun readHandFile(filePath: String): String
    fun isHandFile(filePath: String): Boolean
    fun parseNewHandLine(nextLine: String, input: Scanner, phase: String, nextPhases: Array<String>, hand: Hand): String
    fun parse(): Map<String, Hand>

    fun parseTableLine(nextLine: String, input: Scanner, phase: String, nextPhases: Array<String>, hand: Hand): String

    fun parseSeatLine(nextLine: String, input: Scanner, phase: String, nextPhases: Array<String>, hand: Hand): String

    fun parseAntesAndBlinds(nextLine: String, input: Scanner, phase: String, nextPhases: Array<String>, hand: Hand): String

    fun parseDealer(nextLine: String, input: Scanner, phase: String, nextPhases: Array<String>, hand: Hand): String

    fun readActionsByPhase(nextLine: String, input: Scanner, hand: Hand, phase: String, nextPhases: Array<String>,
                           actions: List<Action>): String

    fun readPreflop(nextLine: String, input: Scanner, hand: Hand): String

    fun readFlop(nextLine: String, input: Scanner, hand: Hand): String

    fun readTurn(nextLine: String, input: Scanner, hand: Hand): String

    fun readRiver(nextLine: String, input: Scanner, hand: Hand): String

    fun readShowdown(nextLine: String, input: Scanner, hand: Hand): String

    fun readSummary(nextLine: String, input: Scanner, phase: String, nextPhases: Array<String>, hand: Hand): String

    fun getCards(cards: String): Array<String>

    fun toCards(cards: Array<String>): Array<Card>

    fun getPlayerBlind(blindDealt: Array<String>): String

    fun readCards(chaine: String): Array<Card>

    fun readPlayer(chaine: String, players: Map<String, Player>): Action

    fun stringToECards(card: String): Card

    fun nextLine(scanner: Scanner): String

    fun getTournamentId(): String

    fun setCurrency(currency: Currency)

    fun parsing(): Map<String, Hand>

    fun parseBuyIn(chaine: String): Double

    fun parseFee(chaine: String): Double

    fun parseLevel(chaine: String): Int

    fun parseHandId(chaine: String): String

    fun parseSmallBlind(chaine: String): Double?

    fun parseBigBlind(chaine: String): Double?

    fun parseTableId(chaine: String): String

    fun parseNumberOfPlayerByTable(chaine: String): Int

    fun parseGameIdCardroom(chaine: String): String

    fun parseButtonSeat(chaine: String): Int?

    fun parsePlayerSeat(chaine: String): Player

    fun parseTotalPot(chaine: String): Double?

    fun parseRake(chaine: String): Double?

    fun parsePlayerAccount(chaine: String): String

    fun getGameTypeFromFilename(fileName: String): GameType

    fun parseHandDate(chaine: String): Date

    fun parseCurrency(chaine: String): Currency

    fun isUselesLine(line: String): Boolean?

    fun fileToMap(): Map<String, StringBuffer>

    fun textToHandDto(text: StringBuffer): Hand

}