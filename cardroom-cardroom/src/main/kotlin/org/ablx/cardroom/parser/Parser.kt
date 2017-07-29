package org.ablx.cardroom.parser

import org.ablx.cardroom.commons.data.Hand
import org.ablx.cardroom.commons.data.Player
import org.ablx.cardroom.commons.enumeration.Action
import org.ablx.cardroom.commons.enumeration.Card
import org.ablx.cardroom.commons.enumeration.Currency
import org.ablx.cardroom.commons.enumeration.GameType
import java.util.*


interface Parser {
    fun readHandFile(): String
    fun isHandFile(filePath: String): Boolean
    fun parseNewHandLine(line: String, phase: String, nextPhases: Array<String>, hand: Hand): String
    fun parse(): MutableMap<String, Hand>?

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

    fun readCards(line: String): Array<Card>

    fun readPlayer(line: String, players: Map<String, Player>): Action

    fun stringToECards(card: String): Card

    fun nextLine(scanner: Scanner): String

    fun getTournamentId(): String

    fun setCurrency(currency: Currency)

    fun parsing(): Map<String, Hand>

    fun parseBuyIn(line: String): Double

    fun parseFee(line: String): Double

    fun parseLevel(line: String): Int

    fun parseHandId(line: String): String

    fun parseSmallBlind(line: String): Double

    fun parseBigBlind(line: String): Double

    fun parseTableId(line: String): String

    fun parseNumberOfPlayerByTable(line: String): Int

    fun parseGameIdCardroom(line: String): String

    fun parseButtonSeat(line: String): Int?

    fun parsePlayerSeat(line: String): Player

    fun parseTotalPot(line: String): Double?

    fun parseRake(line: String): Double?

    fun parsePlayerAccount(line: String): String

    fun getGameTypeFromFilename(fileName: String): GameType

    fun parseHandDate(line: String): Date

    fun parseCurrency(line: String): Currency

    fun isUselesLine(line: String): Boolean?

    fun fileToMap(): Map<String, StringBuffer>

    fun textToHandDto(text: StringBuffer): Hand

}