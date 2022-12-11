package subway.exception

import subway.utils.constants.ErrorMessage

object Validator {

    fun checkMainMenuOptionInput(input: String): String {
        if ((input != "1") and (input != "2") and (input != "3") and (input != "4") and (input != "Q")) throw IllegalArgumentException(
            ErrorMessage.INVALID_OPTION.getMessage()
        )
        return input
    }

    fun checkStationMenuOptionInput(input: String): String {
        if ((input != "1") and (input != "2") and (input != "3") and (input != "B")) throw IllegalArgumentException(
            ErrorMessage.INVALID_OPTION.getMessage()
        )
        return input
    }

    fun checkLineMenuOptionInput(input: String): String {
        if ((input != "1") and (input != "2") and (input != "3") and (input != "B")) throw IllegalArgumentException(
            ErrorMessage.INVALID_OPTION.getMessage()
        )
        return input
    }

    fun checkSectionMenuOptionInput(input: String): String {
        if ((input != "1") and (input != "2") and (input != "B")) throw IllegalArgumentException(
            ErrorMessage.INVALID_OPTION.getMessage()
        )
        return input
    }

    fun checkSectionIndexInput(input: String): Int {
        return input.toInt()
    }
}