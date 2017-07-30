package org.ablx.cardroom.parser

import org.ablx.cardroom.commons.data.Cardroom
import org.ablx.cardroom.commons.enumeration.Currency
import org.ablx.cardroom.commons.enumeration.Operator
import com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER



abstract class CardroomParser() : Parser {

    protected abstract val operator : Operator
    protected abstract val cardroom:Cardroom
    protected abstract val filePath: String
    protected var money = Currency.USD
    val SPACE = " "
    val DEUXPOINTS = ":"
    val PARENTHESEGAUCHE = "("
    val PARENTHESEDROITE = ")"
    val CROCHETOUVRANT = "["
    val CROCHETFERMANT = "]"
    val SLASH = "/"
    val HASHTAG = "#"
    val PLUS = "+"
    val VIRGULE = ","
    val UNDERSCORE = "_"
    val DASH = "-"
    val POINT = "."
    val PIPE = "|"
    val APOSTROPHE = "'"
    val VIDE = ""

    override fun setCurrency(currency: Currency) {
        money=currency
    }

    protected fun startsWith(chaine: String, nextPhases: Array<String>): Boolean {
        for (phase in nextPhases) {

            if (chaine.startsWith(phase)) {
                return true
            }
        }
        return false
    }
}