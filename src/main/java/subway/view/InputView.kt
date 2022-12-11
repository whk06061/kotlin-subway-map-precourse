package subway.view

import subway.exception.Validator
import java.util.*

class InputView {
    private val scanner = Scanner(System.`in`)
    private val validator = Validator()
    fun readFunctionOption(): String {
        val input = scanner.nextLine()
        return validator.checkMainMenuOptionInput(input)
    }
}