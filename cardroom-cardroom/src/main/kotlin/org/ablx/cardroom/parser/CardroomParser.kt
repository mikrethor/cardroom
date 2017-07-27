package org.ablx.cardroom.parser

import org.ablx.cardroom.commons.data.Cardroom
import org.ablx.cardroom.commons.enumeration.Currency
import org.ablx.cardroom.commons.enumeration.Operator

abstract class CardroomParser(val cardroom:Cardroom) : Parser {

    protected abstract var operator : Operator?
    protected var money = Currency.USD
    val ESPACE = " "
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
}