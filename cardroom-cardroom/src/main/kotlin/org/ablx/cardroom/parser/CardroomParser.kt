package org.ablx.cardroom.parser

import org.ablx.cardroom.commons.enumeration.Currency

abstract class CardroomParser : Parser {

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
}