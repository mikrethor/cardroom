package org.ablx.cardroom.commons.data

import org.ablx.cardroom.commons.enumeration.Action
import org.ablx.cardroom.commons.enumeration.Card
import org.ablx.cardroom.commons.enumeration.Round

data class HandAction(var player: Player?, val action: Action, val amount: Double,
                      val cards: Array<Card?>?) {

     lateinit var round: Round


}