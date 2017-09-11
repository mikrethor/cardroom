package org.ablx.cardroom.commons.enumeration

import org.junit.Test
import kotlin.test.assertEquals

class CurrencyTest {
    @Test
    fun testAllCurrencies() {
        assertEquals(Currency.values().size, 4)

        assertEquals(Currency.USD.shortName, "USD")
        assertEquals(Currency.USD.symbol, "\u0024")

        assertEquals(Currency.EURO.shortName, "EUR")
        assertEquals(Currency.EURO.symbol, "\u20AC")

        assertEquals(Currency.POUND.shortName, "GBP")
        assertEquals(Currency.POUND.symbol, "\u00A3")

        assertEquals(Currency.PLAY_MONEY.shortName, "PLAY_MONEY")
        assertEquals(Currency.PLAY_MONEY.symbol, "")
    }
}