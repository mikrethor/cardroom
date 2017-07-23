package org.ablx.cardroom.commons.enumeration

enum class Action(val action: String,val value:Int) {

    FOLDS("folds", 1),
    CALLS("calls", 2),
    RAISES("raises", 3),
    CHECKS("checks", 4),
    BETS("bets", 5),
    COLLECTED("collected", 6),
    SHOWS("shows", 7);
}