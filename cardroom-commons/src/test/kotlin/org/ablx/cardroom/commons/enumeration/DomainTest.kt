package org.ablx.cardroom.commons.enumeration

import org.junit.Test
import kotlin.test.assertEquals

class DomainTest {
    @Test
    fun testAllDomains() {
        assertEquals(Domain.values().size, 2)

        assertEquals(Domain.COM.domainName, "com")
        assertEquals(Domain.FR.domainName, "fr")

    }
}