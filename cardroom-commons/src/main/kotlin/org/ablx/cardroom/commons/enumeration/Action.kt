package org.ablx.cardroom.commons.enumeration

enum class Action(val action: String, val value: Int) {

    FOLDS("folds", 1),
    CALLS("calls", 2),
    RAISES("raises", 3),
    CHECKS("checks", 4),
    BETS("bets", 5),
    COLLECTED("collected", 6),
    SHOWS("shows", 7);


    companion object {
        /**
         * Convertie une chaine de caractere en EAction.

         * @param action
         * *            chaine de caractere.
         * *
         * @return EAction
         */
        fun valueOfCode(action: String): Action {
            values()
                    .asSequence()
                    .filter { it.action == action }
                    .forEach { return it }
            throw IllegalArgumentException(
                    "Partnership status cannot be resolved for value " + action)
        }
    }
}