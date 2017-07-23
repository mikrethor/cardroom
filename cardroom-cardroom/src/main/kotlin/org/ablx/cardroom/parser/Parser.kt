package org.ablx.cardroom.parser

import org.ablx.cardroom.commons.data.Hand
import java.util.*

interface Parser{
    fun parseNewHandLine(nextLine: String, input: Scanner, phase: String, nextPhases: Array<String>, hand: Hand): String
}