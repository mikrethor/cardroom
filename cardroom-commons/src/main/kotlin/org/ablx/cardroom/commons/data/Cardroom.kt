package org.ablx.cardroom.commons.data

import org.ablx.cardroom.commons.enumeration.Domain
import org.ablx.cardroom.commons.enumeration.Operator

data class Cardroom(val id:Long,val operator:Operator, val domain:Domain, val url:String)