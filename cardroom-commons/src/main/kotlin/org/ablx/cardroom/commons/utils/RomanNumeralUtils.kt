package org.ablx.cardroom.commons.utils

class RomanNumeralUtils {

    companion object {
        /**
         * Convertit les chiffres romains en entier.

         * @param romanNumber
         * *            chaine contenant un chiffre romain.
         * *
         * @return Entier equivalent.
         */
        fun toInt(romanNumber: String): Int {
            var decimal = 0
            var lastNumber = 0
            val romanNumeral = romanNumber.toUpperCase()
            /*
             * operation to be performed on upper cases even if user enters roman
             * values in lower case chars
             */
            (romanNumeral.length - 1 downTo 0)
                    .asSequence()
                    .map { romanNumeral[it] }
                    .forEach {
                        when (it) {
                            'M' -> {
                                decimal = processDecimal(1000, lastNumber, decimal)
                                lastNumber = 1000
                            }

                            'D' -> {
                                decimal = processDecimal(500, lastNumber, decimal)
                                lastNumber = 500
                            }

                            'C' -> {
                                decimal = processDecimal(100, lastNumber, decimal)
                                lastNumber = 100
                            }

                            'L' -> {
                                decimal = processDecimal(50, lastNumber, decimal)
                                lastNumber = 50
                            }

                            'X' -> {
                                decimal = processDecimal(10, lastNumber, decimal)
                                lastNumber = 10
                            }

                            'V' -> {
                                decimal = processDecimal(5, lastNumber, decimal)
                                lastNumber = 5
                            }

                            'I' -> {
                                decimal = processDecimal(1, lastNumber, decimal)
                                lastNumber = 1
                            }
                            else -> throw NumberFormatException(
                                    "Conversion impossible en chiffre romain impossible")
                        }
                    }
            return decimal
        }

        fun processDecimal(decimal: Int, lastNumber: Int,
                           lastDecimal: Int): Int {
            if (lastNumber > decimal) {
                return lastDecimal - decimal
            } else {
                return lastDecimal + decimal
            }
        }

    }
}
