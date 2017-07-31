package org.ablx.cardroom.parser

import org.ablx.cardroom.commons.data.Cardroom
import org.ablx.cardroom.commons.enumeration.Card
import org.ablx.cardroom.commons.enumeration.Currency
import org.ablx.cardroom.commons.enumeration.Operator
import com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER


abstract class CardroomParser() : Parser {

    protected abstract val operator: Operator
    protected abstract val cardroom: Cardroom
    protected abstract val filePath: String
    protected var money = Currency.USD
    val SPACE = " "
    val DEUXPOINTS = ":"
    val PARENTHESEGAUCHE = "("
    val PARENTHESEDROITE = ")"
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

    protected fun startsWith(chaine: String, nextPhases: Array<String>): Boolean {
        for (phase in nextPhases) {

            if (chaine.startsWith(phase)) {
                return true
            }
        }
        return false
    }

    override fun readCards(line: String): Array<Card?>? {

        val crochetouvrant = line.lastIndexOf(OPENNING_SQUARE_BRACKET)
        val crochetfermant = line.lastIndexOf(CLOSING_SQUARE_BRACKET)
        val cards = line.substring(crochetouvrant + 1, crochetfermant)
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
            var index = 0
            val tab = arrayOfNulls<Card>(cards.size)
            for (card in cards) {
                tab[index] = stringToCards(card)
                index++
            }
            return tab
        }
    }

    override fun getPlayerBlind(blindDealt: Array<String>): String {

        var playerName: String


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