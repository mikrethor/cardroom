package org.ablx.cardroom.commons.enumeration

enum class Currency(val symbol: String, val shortName: String) {
    EURO("\u20AC", "EUR"),
    USD("\u0024", "USD"),
    POUND("\u00A3", "GBP")
}