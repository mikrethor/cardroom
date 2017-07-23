package org.ablx.cardroom.commons.enumeration

enum class Limit(val limit:String,val description:String){
    NL("NL", "No limit"),
    PL("PL", "Pot limit"),
    FL("PL", "Fixed limit")
}