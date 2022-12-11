package subway.exception

import subway.utils.constants.ErrorMessage

class Validator {

    fun checkMainMenuOptionInput(input: String): String {
        if ((input != "1") and (input != "2") and (input != "3") and (input != "4") and (input != "Q")) throw IllegalArgumentException(
            ErrorMessage.INVALID_OPTION.getMessage())
        return input
    }
}