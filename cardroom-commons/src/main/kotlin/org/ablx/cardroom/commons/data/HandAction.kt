package org.ablx.cardroom.commons.data

import org.ablx.cardroom.commons.enumeration.Round

data class HandAction(val id:Long){
    var phase: Round? = null
}