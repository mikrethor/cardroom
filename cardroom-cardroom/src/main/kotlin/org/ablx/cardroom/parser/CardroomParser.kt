package org.ablx.cardroom.parser

import org.ablx.cardroom.commons.data.Cardroom
import org.ablx.cardroom.commons.enumeration.Card
import org.ablx.cardroom.commons.enumeration.Currency
import org.ablx.cardroom.commons.enumeration.Operator


abstract class CardroomParser() : Parser {

    protected abstract val operator: Operator
    protected abstract val cardroom: Cardroom
    protected abstract val filePath: String
    protected var money = Currency.USD
    val SPACE = " "
    val COLON = ":"
    val LEFT_PARENTHESIS = "("
    val RIGHT_PARENTHESIS = ")"
    val OPENNING_SQUARE_BRACKET = "["
    val CLOSING_SQUARE_BRACKET = "]"
    val SLASH = "/"
    val HASHTAG = "#"
    val PLUS = "+"
    val VIRGULE = ","
    val UNDERSCORE = "_"
    val DASH = "-"
    val POINT = "."
    val PIPE = "|"
    val APOSTROPHE = "'"
    val EMPTY = ""

    override fun setCurrency(currency: Currency) {
        money = currency
    }

    protected fun startsWith(line: String, nextPhases: Array<String>): Boolean {
        for (phase in nextPhases) {

            if (line.startsWith(phase)) {
                return true
            }
        }
        return false
    }

    override fun readCards(line: String): Array<Card?>? {
        val openningSquareBracket = line.lastIndexOf(OPENNING_SQUARE_BRACKET)
        val closingSquareBracket = line.lastIndexOf(CLOSING_SQUARE_BRACKET)
        val cards = line.substring(openningSquareBracket + 1, closingSquareBracket)
        val tab = this.toCards(this.getCards(cards))
        return tab
    }

    override fun stringToCards(card: String): Card {
        return Card.valueOf("C_" + card.toUpperCase())
    }

    override fun toCards(cards: Array<String>?): Array<Card?>? {

        if (cards == null) {
            return null
        } else {
            val tab = arrayOfNulls<Card>(cards.size)
            for ((index, card) in cards.withIndex()) {
                tab[index] = stringToCards(card)
            }
            return tab
        }
    }

    override fun getPlayerBlind(blindDealt: Array<String>): String {
        val playerName: String

        if (blindDealt.size == 5) {
            playerName = blindDealt[0]
        } else {
            val newTab = Array(blindDealt.size - 1, { _ -> "" })
            for (i in 1..blindDealt.size - 1 - 1) {
                newTab[i - 1] = blindDealt[i]
            }
            playerName = blindDealt[0] + SPACE + getPlayerBlind(newTab)
        }
        return playerName
    }

    override fun getCards(cards: String): Array<String> {
        return cards.split(SPACE.toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    }
}